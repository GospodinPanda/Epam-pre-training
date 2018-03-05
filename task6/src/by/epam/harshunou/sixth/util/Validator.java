package by.epam.harshunou.sixth.util;

import by.epam.harshunou.sixth.exceptions.WrongInputException;

public class Validator {
    public static int checkMaxSize(int maxSize) throws WrongInputException {
        if (maxSize < 0) {
            throw new WrongInputException("The size must be positive");
        }
        return maxSize;
    }
}
