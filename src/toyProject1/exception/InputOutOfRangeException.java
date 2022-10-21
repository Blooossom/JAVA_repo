package toyProject1.exception;

public class InputOutOfRangeException extends RuntimeException{
    public InputOutOfRangeException() {super("Invalid Input. Please try again.");
    }

    public InputOutOfRangeException(String message) {
        super(message);
    }
}
