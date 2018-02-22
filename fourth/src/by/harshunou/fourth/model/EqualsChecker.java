package by.harshunou.fourth.model;

public class EqualsChecker {
    public static boolean checkEquality(int numberToDivide, int number) {
        if (numberToDivide != 0) {
            number -= numberToDivide % 10;
            numberToDivide /= 10;
            return checkEquality(numberToDivide, number);
        } else {
            return number == 0;
        }
    }

    public static boolean checkEqualityIterative(int numberToDivide, int number) {
        while (numberToDivide != 0) {
            number -= numberToDivide % 10;
            numberToDivide /= 10;
        }
        return number == 0;
    }
}
