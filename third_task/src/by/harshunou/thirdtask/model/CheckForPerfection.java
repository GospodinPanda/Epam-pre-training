package by.harshunou.thirdtask.model;

public class CheckForPerfection {
    public static boolean isPerfect(int number) {
        int sumOfDividers = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }
        if (sumOfDividers == number) {
            return true;
        } else {
            return false;
        }
    }
}
