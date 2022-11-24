package bo.ucb.edu.backendSpringMrJeff.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.ucb.edu.backendSpringMrJeff.dao.MrRoleDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrUserDao;
import bo.ucb.edu.backendSpringMrJeff.dto.AuthReqDto;
import bo.ucb.edu.backendSpringMrJeff.dto.AuthResDto;
import bo.ucb.edu.backendSpringMrJeff.dto.UserDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrRole;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SecurityBl {



    public static final String JWT_SECRET = "PasswordMasSeguroDelMundo1234";
    private MrUserDao mrUserDao;
    private MrRoleDao mrRoleDao;

    public SecurityBl(MrUserDao mrUserDao, MrRoleDao mrRoleDao){
        this.mrUserDao = mrUserDao;
        this.mrRoleDao = mrRoleDao;
    }

    /**
     * Método realizado para probar la conexión a la BBDD
     * @param userId
     * @return
     */
    public UserDto getUserByPk(Integer userId) {
        MrUser mrUser = mrUserDao.findByPrimaryKey(userId);
        System.out.println(mrUser);
        // Transformamos la entidad de Base de Datos
        // a un DTO para retornar via API  (Data Transfer Object)
        UserDto userDto = new UserDto(mrUser.getUserId(), mrUser.getUsername());
        return userDto;
    }

    /**
     * Este metodo realiza la autenticación del sistema, va a buscar al repositorio de BBDD
     * la contraseña del usuario y la compara con su equivalente en BCRYPT
     * @param credentials
     * @return
     */
    public AuthResDto authenticate(AuthReqDto credentials) {
        AuthResDto result = new AuthResDto();
        System.out.println("Comenzando proceso de autenticación con: " + credentials);
        String currentPasswordInBCrypt = mrUserDao.findByUsernameAndPassword(credentials.username());
        System.out.println("Se obtuvo la siguiente contraseña de bbdd: " + currentPasswordInBCrypt);
        // Consulto si los passwords coinciden
        if (currentPasswordInBCrypt != null ) {
            System.out.println("Se procede a verificar si las contraseñas coinciden");
            BCrypt.Result bcryptResult = BCrypt.verifyer().verify(credentials.password().toCharArray(), currentPasswordInBCrypt);
            if (bcryptResult.verified) { // Ha sido verificado
                // Procedo a generar el token
                System.out.println("Las constraseñas coinciden se genera el token");
                // se consulta por los roles que tiene el usuario

                List<MrRole> roles = mrRoleDao.findRolesByUsername(credentials.username());

                System.out.println("usernam>" + credentials.username()+"(bl/securityBl/authenticate) -"+ roles);
                List<String> roleasAsString = new ArrayList<>();

                for(MrRole role: roles){
                    roleasAsString.add(role.getName());
                }

                 // FIXME: Error en la segurrida
                    System.out.println(roleasAsString);
                result = generateTokenJwt(credentials.username(), 30000, roleasAsString);
            } else {
                System.out.println("Las constraseñas no coinciden");
                throw new RuntimeException("Forbiden the secret and password are wrong.");
            }
        } else {
            System.out.println("Usuario no existente");
            throw new RuntimeException("Forbiden the secret and password are wrong.");
        }
        return result;
    }

    // valida el JWT y retorna un MRuser
    public MrUser validateJwtToker(String jwt){
        System.out.printf("Se valida el token: " + jwt);
        MrUser result = null;
        try {
            String username = JWT.require(Algorithm.HMAC256(JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getSubject();

            result = mrUserDao.findByUsername(username);
        } catch (Exception exception){
            throw new MrJeffException("El usuario y cotraseña son incorrectos.", exception);
        }
        return result;
    }



    // generaadno el tokem

    private AuthResDto generateTokenJwt(String subject, int expirationTimeInSeconds, List<String> roles){
        AuthResDto result = new AuthResDto();

        try{
            Algorithm algorithm = Algorithm.HMAC256(JWT_SECRET);
            String token = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(subject)
                    .withArrayClaim("roles", roles.toArray(new String[roles.size()]))
                    .withClaim("refresh", false)
                    .withExpiresAt(new Date(System.currentTimeMillis() + (expirationTimeInSeconds * 1000)))
                    .sign(algorithm);
            result.setToken(token);

            String refreshToken = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(subject)
                    .withClaim("refresh", true)
                    .withExpiresAt(new Date(System.currentTimeMillis() + (expirationTimeInSeconds * 1000 * 2)))
                    .sign(algorithm);
            result.setRefresh(refreshToken);
        }catch (JWTCreationException exception){
            throw new MrJeffException("Error al generar el token", exception);
        }
        return result;
    }
}
