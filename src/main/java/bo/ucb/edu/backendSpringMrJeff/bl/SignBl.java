package bo.ucb.edu.backendSpringMrJeff.bl;

import bo.ucb.edu.backendSpringMrJeff.dao.MrUserGroupDao;
import bo.ucb.edu.backendSpringMrJeff.dao.PersonDao;
import bo.ucb.edu.backendSpringMrJeff.dao.UserDao;
import bo.ucb.edu.backendSpringMrJeff.dto.MrPersonDto;
import bo.ucb.edu.backendSpringMrJeff.dto.MrUserDto;
import org.springframework.stereotype.Service;

@Service
public class SignBl
{
    private PersonDao personDao;
    private UserDao userDao;
    private MrUserGroupDao mrUserGroupDao;

    public SignBl(PersonDao personDao, UserDao userDao, MrUserGroupDao mrUserGroupDao)
    {
        this.personDao = personDao;
        this.userDao = userDao;
        this.mrUserGroupDao = mrUserGroupDao;
    }

    public void signUp(MrPersonDto mrPersonDto, MrUserDto userDto)
    {
        personDao.createPerson(mrPersonDto);
        Integer id = getPersonIdByPerson(mrPersonDto);
        userDao.createUserWithPersonId(userDto, id);
        Integer userId = userDao.findIdUserByUser(userDto);
        mrUserGroupDao.createUserGroup(userId);
    }

    public Integer getPersonIdByPerson(MrPersonDto mrPersonDto)
    {
        return personDao.findIdPersonByPerson(mrPersonDto);
    }
}
