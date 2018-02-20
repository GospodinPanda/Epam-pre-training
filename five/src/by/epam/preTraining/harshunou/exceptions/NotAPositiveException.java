package by.epam.preTraining.harshunou.exceptions;

public class NotAPositiveException extends WrongInputException {
    public NotAPositiveException() {
        super();
    }

    public NotAPositiveException(String message) {
        super(message);
    }

    public NotAPositiveException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAPositiveException(Throwable cause) {
        super(cause);
    }

    protected NotAPositiveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
