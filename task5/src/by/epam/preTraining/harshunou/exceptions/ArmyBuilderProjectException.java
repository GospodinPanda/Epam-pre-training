package by.epam.preTraining.harshunou.exceptions;

public class ArmyBuilderProjectException extends Exception {
    public ArmyBuilderProjectException() {
        super();
    }

    public ArmyBuilderProjectException(String message) {
        super(message);
    }

    public ArmyBuilderProjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArmyBuilderProjectException(Throwable cause) {
        super(cause);
    }

    protected ArmyBuilderProjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
