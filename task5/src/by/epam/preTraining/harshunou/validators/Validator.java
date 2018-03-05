package by.epam.preTraining.harshunou.validators;

import by.epam.preTraining.harshunou.exceptions.NotAPositiveException;

public class Validator {
    public void checkForPositive(int... numbers) throws NotAPositiveException {
        for (int numb :
                numbers) {
            if (numb < 0) {
                throw new NotAPositiveException("You have to input positive numbers");
            }
        }
    }
}
