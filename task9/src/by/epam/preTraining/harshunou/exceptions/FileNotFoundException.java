package by.epam.preTraining.harshunou.exceptions;

public class FileNotFoundException extends Task9Exception {
    public FileNotFoundException() {
        super();
    }

    public FileNotFoundException(String message) {
        super(message);
    }

    public FileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileNotFoundException(Throwable cause) {
        super(cause);
    }

    protected FileNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
