package by.harshunou.fourth.model;

public class EqualsChecker {
    public static boolean checkEquality(int numberToDivide,int number)
    {
        return SumOfDigits.countDigitsSum(numberToDivide)==number;
    }
}
