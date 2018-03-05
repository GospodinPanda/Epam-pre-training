package by.epam.preTraining.harshunou.exceptions;

public class CustomTreeIsEmptyException extends CustomTreeProjectException {
    public CustomTreeIsEmptyException() {
        super();
    }

    public CustomTreeIsEmptyException(String message) {
        super(message);
    }

    public CustomTreeIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomTreeIsEmptyException(Throwable cause) {
        super(cause);
    }
}
