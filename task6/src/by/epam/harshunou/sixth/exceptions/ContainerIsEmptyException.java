package by.epam.harshunou.sixth.exceptions;

public class ContainerIsEmptyException extends AbstractStructuresException {
    public ContainerIsEmptyException() {
        super();
    }

    public ContainerIsEmptyException(String message) {
        super(message);
    }

    public ContainerIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContainerIsEmptyException(Throwable cause) {
        super(cause);
    }

    protected ContainerIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
