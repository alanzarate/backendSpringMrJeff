package bo.ucb.edu.backendSpringMrJeff.util;

import bo.ucb.edu.backendSpringMrJeff.bl.SecurityBl;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;

import java.util.List;
import java.util.Map;

public class AuthUtil {

    /**
     * Se recibe el toker y sale bien se retorna el sub o subject, caso controario se lanza una excepcion
     * @param jwt
     * @return
     */
    public static String isUserAuthenticated(String jwt) {
        String subject = null;
        String other =null;
        try {
            subject = JWT.require(Algorithm.HMAC256(SecurityBl.JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getSubject();

            other = JWT.require(Algorithm.HMAC256(SecurityBl.JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getPayload();

            System.out.println("(util/AuthUtil/isAuthenticated): subject: " + subject +"  payload: "+other );
        } catch (JWTVerificationException ex) {
            throw new MrJeffException("Usuario no autenticado");
        }
        return subject;
    }

    public static String getTokenFromHeader(Map<String, String> headers) {
        if (headers.get("Authorization") == null && headers.get("authorization") == null ) {
            throw new MrJeffException("No se ha enviado el token de autorización");
        }
        // Se acostumbra que cuando se envia el token, se lo envia en el siguiente formato
        // Authorization: Bearer TOKEN
        String jwt = "";
        if (headers.get("Authorization") != null) {
            jwt = headers.get("Authorization").split(" ")[1];
        } else {
            jwt = headers.get("authorization").split(" ")[1];
        }
        return jwt;
    }


    /**
     * Recibimos el token JWT y verificamos si tiene un rol en particular
     * @param jwt
     * @return true si tiene el rol y false si no lo tiene
     */
    public static boolean tokenHasRole(String jwt, String role) {
        List<String> roles = JWT.require(Algorithm.HMAC256(SecurityBl.JWT_SECRET))
                .build()
                .verify(jwt)
                .getClaim("roles").asList(String.class);

        return roles.contains(role);
    }


    /**
     * Recibimos el token JWT y verificamos si tiene un rol en particular, si no lo tiene se lanza excepción
     * @param jwt token JWT
     */
    public static void verifyHasRole(String jwt, String role) {
        try{
            List<String> roles = JWT.require(Algorithm.HMAC256(SecurityBl.JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getClaim("roles").asList(String.class);
            if(!roles.contains(role)) {
                throw new MrJeffException("No tiene permisos para realizar esta acción");
            }
        }catch (TokenExpiredException ex){
            throw new MrJeffException("Token ha expirado");
        }

    }

    public static String getUserNameFromToken(String jwt) {
        try{
            return  JWT.require(Algorithm.HMAC256(SecurityBl.JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getSubject();
        }catch (TokenExpiredException ex){
            throw new MrJeffException("Token ha expirado");
        }
    }
}
