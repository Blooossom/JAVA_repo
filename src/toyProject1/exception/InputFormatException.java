package toyProject1.exception;

public class InputFormatException extends RuntimeException{
    public InputFormatException() {super("Invalid Input for Format. Please try again.");
    }

    public InputFormatException(String message) {
        super(message);
    }
}
