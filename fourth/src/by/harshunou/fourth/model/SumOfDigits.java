package by.harshunou.fourth.model;

public class SumOfDigits {
    public static int countDigitsSum(int number) {
        int sum = 0;
        if (number > 0) {
            sum += (number % 10) + countDigitsSum(number /= 10);
        }
        return sum;
    }
}
