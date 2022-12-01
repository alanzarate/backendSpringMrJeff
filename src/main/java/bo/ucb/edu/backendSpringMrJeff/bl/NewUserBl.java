package bo.ucb.edu.backendSpringMrJeff.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.ucb.edu.backendSpringMrJeff.dao.MrGroupDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrPersonDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrUserDao;
import bo.ucb.edu.backendSpringMrJeff.dto.NewUserReqDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrPerson;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class NewUserBl {

    private JavaMailSender javaMailSender;
    private Map<String, String> newUserReqDtoMap;

    private MrPersonDao mrPersonDao;
    private MrUserDao mrUserDao;
    private MrGroupDao mrGroupDao;

    public NewUserBl(JavaMailSender javaMailSender, MrPersonDao mrPersonDao, MrUserDao mrUserDao, MrGroupDao mrGroupDao){
        this.javaMailSender = javaMailSender;
        this.newUserReqDtoMap = new HashMap<>();
        this.mrUserDao = mrUserDao;
        this.mrPersonDao = mrPersonDao;
        this.mrGroupDao = mrGroupDao;
    }
    public void sendMailWithAttachment(String toEmail,
                                       String body,
                                       String subject,
                                       String attachment){

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try{
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom("alan.zarate@ucb.edu.bo");
            mimeMessageHelper.setTo(toEmail);
            mimeMessageHelper.setText(body);
            mimeMessageHelper.setSubject(subject);


            if(attachment != null){
                FileSystemResource fileSystemResource =
                        new FileSystemResource(new File(attachment));
                mimeMessageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
            }


            javaMailSender.send(mimeMessage);
            System.out.println(" ====> Se envio en correo al correo"+toEmail );


        }catch ( MessagingException mex){
            throw new MrJeffException("Error enviando el mail "+  mex.getMessage());
        }

    }

    public void createNewUser(NewUserReqDto newUserReqDto) {
        try{
            MrUser mrUser = mrUserDao.findByUsername(newUserReqDto.getUsername().trim());
            System.out.println(mrUser);
            if(mrUser == null){
                String token  =  generateToken(5);
                newUserReqDtoMap.put(newUserReqDto.getEmail(), token);

                sendMailWithAttachment(newUserReqDto.getEmail(), "Tu código es: "+ token, "Código de nuevo usuario", null);
                System.out.println("Se envio en correo al correo" + newUserReqDto.getEmail());
            }else{
                throw new MrJeffException("Error, nombre de usuario no valido");
            }
        }catch (Exception e){
            throw new MrJeffException("No se pudo crear cc");
        }



    }
    public void createRealNewUser(NewUserReqDto newUserReqDto){

        if(newUserReqDtoMap.containsKey(newUserReqDto.getEmail())){
            if(newUserReqDtoMap.get(newUserReqDto.getEmail()).equals(newUserReqDto.getToken())){
                MrPerson mrPerson = new MrPerson();
                mrPerson.setGenderPerson(newUserReqDto.getGender());
                mrPerson.setFirstName(newUserReqDto.getFirstName());
                mrPerson.setLastName(newUserReqDto.getLastName());
                mrPerson.setNumPhone(newUserReqDto.getNumPhone());
                mrPersonDao.createNewPerson(mrPerson);
                // se creo la persona

                int codePerson = mrPersonDao.viewLastPersonCreated();

                // empieza a crear el usuario
                MrUser mrUser = new MrUser();
                mrUser.setUsername(newUserReqDto.getUsername());
                String secret = BCrypt.withDefaults().hashToString(12, newUserReqDto.getPassword().toCharArray());
                mrUser.setSecret(secret);
                mrUser.setEmail(newUserReqDto.getEmail());
                this.mrUserDao.createUserWithPersonId(mrUser, codePerson);
                // se creo el usuario

                // obtine el ultimo del usuario
                int codeUser = mrUserDao.viewLastUserCreated();
                
                // seleccionar el grupo al que va a pertencer


                int idGroup = switch (newUserReqDto.getRole()) {
                    case "courier" -> mrGroupDao.getIdOfGroup("courier");
                    case "admin" -> mrGroupDao.getIdOfGroup("admin");
                    case "user" -> mrGroupDao.getIdOfGroup("user");
                    default -> 0;
                };
                // se crea la relacion del grupo y el usuario
                mrGroupDao.createNewUserGroup(idGroup, codeUser);

                newUserReqDtoMap.remove(newUserReqDto.getEmail());

            }else{
                throw new MrJeffException("El token no iguala");
            }
        }else {
            throw new MrJeffException("No existe el correo en el mapa");
        }
    }

    private String generateToken(int targetLength){
        int leftLimit = 48; // numeral '0'
        //int rightLimit = 132; // letter 'z'
        int rightLimit = 90; //letter 'Z'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
