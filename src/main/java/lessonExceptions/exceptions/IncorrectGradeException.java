package lessonExceptions.exceptions;

import java.io.PrintWriter;

public class IncorrectGradeException extends Exception {
    public IncorrectGradeException() {
        super();
    }

    public IncorrectGradeException(String message) {
        super(message);
    }

    public IncorrectGradeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectGradeException(Throwable cause) {
        super(cause);
    }

    public void fillInStackTrace(PrintWriter writer) {
    }
}
