package toyProject1.exception;

public class InputEmptyException extends RuntimeException{
    public InputEmptyException(){super("Input Empty. Please input something");}
    public InputEmptyException(String message) {
        super(message);
    }
}
