package by.harshunou.thirdtask.model;

public class CheckForPrime {
    public static boolean isPrime(int numberToCheck) {
        boolean isPrime = true;
        int sqrtOfANumber = (int) Math.sqrt(numberToCheck);
        if (numberToCheck == 2) {
            isPrime = true;
        } else if (numberToCheck == 1 || numberToCheck % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = 3; i < sqrtOfANumber; i += 2) {
                if (numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

}
