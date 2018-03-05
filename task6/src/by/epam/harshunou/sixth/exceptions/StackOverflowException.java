package by.epam.harshunou.sixth.exceptions;

public class StackOverflowException extends ContainerOverflowException {
    public StackOverflowException() {
        super();
    }

    public StackOverflowException(String message) {
        super(message);
    }

    public StackOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public StackOverflowException(Throwable cause) {
        super(cause);
    }

    protected StackOverflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
