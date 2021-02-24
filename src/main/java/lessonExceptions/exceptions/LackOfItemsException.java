package lessonExceptions.exceptions;

public class LackOfItemsException extends Exception{
    public LackOfItemsException() {
        super();
    }

    public LackOfItemsException(String message) {
        super(message);
    }

    public LackOfItemsException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfItemsException(Throwable cause) {
        super(cause);
    }
}
