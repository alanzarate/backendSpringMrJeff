package bo.ucb.edu.backendSpringMrJeff.bl;

import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmailBl {


    private JavaMailSender javaMailSender;

    public EmailBl(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;

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



        }catch ( MessagingException mex){
            throw new MrJeffException("Error enviando el mail "+  mex.getMessage());
        }

    }
}
