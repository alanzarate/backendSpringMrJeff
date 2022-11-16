package bo.ucb.edu.backendSpringMrJeff.api;

import bo.ucb.edu.backendSpringMrJeff.bl.SecurityBl;
import bo.ucb.edu.backendSpringMrJeff.dto.AuthReqDto;
import bo.ucb.edu.backendSpringMrJeff.dto.AuthResDto;
import bo.ucb.edu.backendSpringMrJeff.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthApi {
    private SecurityBl securityBl;

    public AuthApi(SecurityBl securityBl) {
        this.securityBl = securityBl;
    }

    @GetMapping("/{userId}")
    public UserDto test(@PathVariable(name = "userId") Integer userId) {
        return this.securityBl.getUserByPk(userId);
    }

    @PostMapping()
    public AuthResDto authentication(@RequestBody AuthReqDto authReqDto) {
        return securityBl.authenticate(authReqDto);
    }


}
