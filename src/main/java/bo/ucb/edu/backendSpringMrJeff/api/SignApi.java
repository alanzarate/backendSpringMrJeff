package bo.ucb.edu.backendSpringMrJeff.api;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.ucb.edu.backendSpringMrJeff.bl.SignBl;
import bo.ucb.edu.backendSpringMrJeff.dto.MrPersonDto;
import bo.ucb.edu.backendSpringMrJeff.dto.MrUserDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/sign")
public class SignApi
{
    private SignBl signBl;

    public SignApi(SignBl signBl)
    {
        this.signBl = signBl;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public void signIn(@RequestBody Map<String, String> body)
    {
        MrPersonDto mrPersonDto = new MrPersonDto();
        MrUserDto mrUserDto = new MrUserDto();

        mrUserDto.setUsername(body.get("username"));
        mrUserDto.setEmail(body.get("email"));
        mrUserDto.setSecret(BCrypt.withDefaults().hashToString(12, body.get("secret").toCharArray()));
        mrPersonDto.setFirstName(body.get("firstName"));
        mrPersonDto.setLastName(body.get("lastName"));
        mrPersonDto.setNumPhone(body.get("numPhone"));
        mrPersonDto.setGenderPerson(1);

        signBl.signUp(mrPersonDto, mrUserDto);

    }
}
