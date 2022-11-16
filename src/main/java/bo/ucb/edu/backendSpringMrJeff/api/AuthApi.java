package bo.ucb.edu.backendSpringMrJeff.api;

import bo.ucb.edu.backendSpringMrJeff.bl.SecurityBl;
import bo.ucb.edu.backendSpringMrJeff.dto.AuthReqDto;
import bo.ucb.edu.backendSpringMrJeff.dto.AuthResDto;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;
import bo.ucb.edu.backendSpringMrJeff.dto.UserDto;
import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;
import org.springframework.http.ResponseEntity;
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

//    @PostMapping()
//    public AuthResDto authentication(@RequestBody AuthReqDto authReqDto) {
//        return securityBl.authenticate(authReqDto);
//    }
//   -------- > se covierte en lo siguiente
    // another way

    @PostMapping()
    public ResponseDto<AuthResDto> authentication(@RequestBody AuthReqDto authReqDto){
        try {
            //Thread.sleep(3000);

        }catch (Exception ex){

        }
        if(authReqDto != null && authReqDto.username() != null && authReqDto.password() != null){
            // se mandaron todos los datos necesario> username and password
            try{
                // seprocesde a verificar autencticar
                return new ResponseDto<>(securityBl.authenticate(authReqDto), null, true);
            }catch (MrJeffException ex){
                return new ResponseDto<>(null, ex.getMessage(), false);
            }
        }else{
            return new ResponseDto<>(null, "Credenciales incorrectas", false);
        }
    }

    /**
      SOLO PARA PROPOSITOS ILUSTRATIVOS, ESTA ES LA FORMA CORRECTA EN EL ÁMBITO LABORAL.
     por el import de : import org.springframework.http.ResponseEntity;
      @param authReqDto
      @return

    @RequestMapping(value="/v2/", method = RequestMethod.POST)
    public ResponseEntity<ResponseDto<AuthResDto>> authenticationV2(@RequestBody  AuthReqDto authReqDto) {
        if (authReqDto != null && authReqDto.username() != null && authReqDto.password() != null) {
            // Retorna los tokens, null (porque no hay error), true porque fue exitoso
            try {
                ResponseDto<AuthResDto> responseDto = new  ResponseDto<>(securityBl.authenticate(authReqDto), null, true);
                return new ResponseEntity<>(responseDto, HttpStatus.OK);
            } catch (MrJeffException ex) {
                ResponseDto<AuthResDto> responseDto = new ResponseDto<>(null, ex.getMessage(),
                        false);
                return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
            }

        } else {
            ResponseDto<AuthResDto> responseDto = new ResponseDto<>(null, "Credenciales incorrectas",
                    false);
            return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
        }
    }
     */





}
