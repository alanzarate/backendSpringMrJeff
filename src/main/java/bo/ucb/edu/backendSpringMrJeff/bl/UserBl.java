package bo.ucb.edu.backendSpringMrJeff.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.ucb.edu.backendSpringMrJeff.dao.MrUserDao;
import bo.ucb.edu.backendSpringMrJeff.dto.CreateUserDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import org.springframework.stereotype.Service;

@Service
public class UserBl {
    private MrUserDao mrUserDao;

    public UserBl(MrUserDao mrUserDao){
        this.mrUserDao = mrUserDao;
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
}
