package by.epam.harshunou.sixth.exceptions;

public class AbstractStructuresException extends Exception {
    public AbstractStructuresException() {
        super();
    }

    public AbstractStructuresException(String message) {
        super(message);
    }

    public AbstractStructuresException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbstractStructuresException(Throwable cause) {
        super(cause);
    }

    protected AbstractStructuresException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
