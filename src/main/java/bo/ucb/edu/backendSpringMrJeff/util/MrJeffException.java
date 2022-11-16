package bo.ucb.edu.backendSpringMrJeff.util;

public class MrJeffException extends RuntimeException{

    public MrJeffException(String message){
        super(message);
    }
    public MrJeffException(String message, Throwable cause){
        super(message, cause);
    }
}
