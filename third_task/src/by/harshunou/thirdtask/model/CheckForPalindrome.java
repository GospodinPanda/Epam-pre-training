package by.harshunou.thirdtask.model;

public class CheckForPalindrome {
    public static boolean isPalindrome(int numberToCheck) {
        int tempNumber = numberToCheck;
        int reverseNumber = 0;
        while (tempNumber != 0) {
            reverseNumber = reverseNumber * 10 + tempNumber % 10;
            tempNumber /= 10;
        }
        if (numberToCheck == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}


