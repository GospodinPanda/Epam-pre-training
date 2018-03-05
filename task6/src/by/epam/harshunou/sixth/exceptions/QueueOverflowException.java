package by.epam.harshunou.sixth.exceptions;

public class QueueOverflowException extends ContainerOverflowException {
    public QueueOverflowException() {
        super();
    }

    public QueueOverflowException(String message) {
        super(message);
    }

    public QueueOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueOverflowException(Throwable cause) {
        super(cause);
    }

    protected QueueOverflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
