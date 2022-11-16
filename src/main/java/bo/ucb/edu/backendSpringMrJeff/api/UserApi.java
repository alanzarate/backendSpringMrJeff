package bo.ucb.edu.backendSpringMrJeff.api;

import bo.ucb.edu.backendSpringMrJeff.bl.SecurityBl;
import bo.ucb.edu.backendSpringMrJeff.bl.UserBl;
import bo.ucb.edu.backendSpringMrJeff.dto.CreateUserDto;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrPerson;
import bo.ucb.edu.backendSpringMrJeff.util.AuthUtil;
import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserApi {

    private UserBl userBl;
    private SecurityBl securityBl;
    public UserApi(UserBl userBl, SecurityBl securityBl){
        this.userBl = userBl;
        this.securityBl = securityBl;
    }
/**
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
    MEJORANDO ESTE CODIGO DE AQUI
    **/

    @PostMapping(value = "/new")
    public ResponseDto<String> createUser(@RequestHeader Map<String, String> headers, @RequestBody CreateUserDto createUserDto){
        try{
            String jwt = AuthUtil.getTokenFromHeader(headers);
            // se hay un error se lanza una excepcion
            AuthUtil.verifyHasRole(jwt, "createNewUser");
            userBl.createUser(createUserDto);
            return new ResponseDto<>("Usuario creado correctamente", null, true);
        } catch (MrJeffException ex) {
            return new ResponseDto<>(ex.getMessage(), null, false);
        }

    }



    /**
     * Endpoint para probar la busqueda por llave primaria
     */
    @GetMapping("/")
    public ResponseDto<MrPerson> getUserFromToken(@RequestHeader Map<String, String> headers) {
        try {
            Thread.sleep(3000);
        } catch (Exception ex) {
            // Do nothing
        }
        try {
            String username = AuthUtil.isUserAuthenticated(AuthUtil.getTokenFromHeader(headers));
            return new ResponseDto<>(this.userBl.findPersonByUsername(username), null, true);
        }
        catch (MrJeffException ex) {
            return new ResponseDto<>(null, ex.getMessage(), false);
        }
    }



}
