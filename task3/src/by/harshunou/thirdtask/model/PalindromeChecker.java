package by.harshunou.thirdtask.model;

public class PalindromeChecker {
    public static boolean checkPalindrome(int numberToCheck) {
        int tempNumber = numberToCheck;
        int reverseNumber = 0;
        while (tempNumber != 0) {
            reverseNumber = reverseNumber * 10 + tempNumber % 10;
            tempNumber /= 10;
        }
        return (numberToCheck == reverseNumber);

    }
}


