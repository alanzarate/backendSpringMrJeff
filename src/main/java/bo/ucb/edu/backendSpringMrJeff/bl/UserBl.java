package bo.ucb.edu.backendSpringMrJeff.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.ucb.edu.backendSpringMrJeff.dao.MrPersonDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrUserDao;
import bo.ucb.edu.backendSpringMrJeff.dto.CreateUserDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrPerson;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import org.springframework.stereotype.Service;

@Service
public class UserBl {
    private MrUserDao mrUserDao;
    private MrPersonDao mrPersonDao;

    public UserBl(MrUserDao mrUserDao, MrPersonDao mrPersonDao){
        this.mrUserDao = mrUserDao;
        this.mrPersonDao = mrPersonDao;
    }
    public void createUser(CreateUserDto createUserDto){
        MrUser mrUser = new MrUser();
        mrUser.setUsername(createUserDto.getUsername());
        // la bendita encriptacion
        String secret = BCrypt.withDefaults().hashToString(12, createUserDto.getSecret().toCharArray());
        mrUser.setSecret(secret);
        mrUser.setEmail(createUserDto.getEmail());
        this.mrUserDao.createUserWithPersonId(mrUser, createUserDto.getPersonId());
    }

    public MrPerson findPersonByUsername(String username){
        return mrPersonDao.findPersonByUsername(username);
    }
}
