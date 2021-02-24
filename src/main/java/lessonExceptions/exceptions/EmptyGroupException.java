package lessonExceptions.exceptions;

public class EmptyGroupException extends Exception{
    public EmptyGroupException() {
        super();
    }

    public EmptyGroupException(String message) {
        super(message);
    }

    public EmptyGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyGroupException(Throwable cause) {
        super(cause);
    }
}
