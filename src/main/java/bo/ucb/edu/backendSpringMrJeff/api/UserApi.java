package bo.ucb.edu.backendSpringMrJeff.api;

import bo.ucb.edu.backendSpringMrJeff.bl.UserBl;
import bo.ucb.edu.backendSpringMrJeff.dto.CreateUserDto;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserApi {

    private UserBl userBl;
    public UserApi(UserBl userBl){
        this.userBl = userBl;
    }

    @PostMapping(value = "/new")
    public Map createUser(@RequestBody CreateUserDto createUserDto){
        System.out.println(createUserDto);

        userBl.createUser(createUserDto);
        List<String> alanRoles =  new ArrayList<>();
        alanRoles.add("admin");
        alanRoles.add("user");
        alanRoles.add(createUserDto.getPersonId().toString());

        Map<String, Object> returned = new HashMap<>();
        returned.put("data", alanRoles);
        returned.put("message", "Se creo el usuario");
        returned.put("error", null);
        return returned;
        //return Map.of("data", "User created");
    }

}
