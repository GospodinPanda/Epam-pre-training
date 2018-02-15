package by.harshunou.thirdtask.model;

public class PerfectionChecker {
    public static boolean checkPerfection(int number) {
        int sumOfDividers = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }
        return sumOfDividers == number;
    }
}
