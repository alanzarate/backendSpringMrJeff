package bo.ucb.edu.backendSpringMrJeff.dao;

import bo.ucb.edu.backendSpringMrJeff.dto.MrUserDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserDao
{
    @Select("""
            SELECT
            	usr.mr_user_id
            FROM
                	mr_user usr
                WHERE
                	usr.email = #{email}
                	and usr.username = #{username}
                	and usr.status = 1;
            """)
    Integer findIdUserByUser(MrUserDto mrUserDto);

    @Select("""
            Select * from mr_user where mr_user_id = #{userId}
            """)
    MrUser findByPrimaryKey(Integer userId);

    @Insert("""
            INSERT INTO mr_user (username, secret, email, cat_user_status, mr_person_id, status, tx_date, tx_user, tx_host, created) 
            VALUES (#{mrUser.username}, #{mrUser.secret}, #{mrUser.email}, 'active', #{id}, 1, now(), 'anonymous', 'localhost', now());
            """)
    void createUserWithPersonId(MrUserDto mrUser, Integer id);

}
