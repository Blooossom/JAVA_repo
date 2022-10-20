package toyProject_1.exception;

public class InputEmptyException extends RuntimeException{
    public InputEmptyException(){super("Empty Input. Please input something.");}

    public InputEmptyException(String message){super(message);}
}
