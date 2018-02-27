package by.epam.harshunou.sixth.exceptions;

public class StackIsEmptyException extends AbstractStructuresException {
    public StackIsEmptyException() {
        super();
    }

    public StackIsEmptyException(String message) {
        super(message);
    }

    public StackIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public StackIsEmptyException(Throwable cause) {
        super(cause);
    }

    protected StackIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
