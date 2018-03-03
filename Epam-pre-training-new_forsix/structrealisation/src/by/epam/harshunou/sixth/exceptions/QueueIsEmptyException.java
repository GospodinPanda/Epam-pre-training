package by.epam.harshunou.sixth.exceptions;

public class QueueIsEmptyException extends ContainerIsEmptyException {
    public QueueIsEmptyException() {
        super();
    }

    public QueueIsEmptyException(String message) {
        super(message);
    }

    public QueueIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueIsEmptyException(Throwable cause) {
        super(cause);
    }

    protected QueueIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
