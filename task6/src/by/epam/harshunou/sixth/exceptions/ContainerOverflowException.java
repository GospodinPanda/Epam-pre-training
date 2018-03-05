package by.epam.harshunou.sixth.exceptions;

public class ContainerOverflowException extends AbstractStructuresException {
    public ContainerOverflowException() {
        super();
    }

    public ContainerOverflowException(String message) {
        super(message);
    }

    public ContainerOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContainerOverflowException(Throwable cause) {
        super(cause);
    }

    protected ContainerOverflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
