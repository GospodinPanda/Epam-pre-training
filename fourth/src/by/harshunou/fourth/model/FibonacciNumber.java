package by.harshunou.fourth.model;

import static java.lang.Math.abs;

public class FibonacciNumber {
    public static int countFibonacciNumberRecoursive(int n) {
        int result = 1;
        if (n < 0) {
            return -1;
        }
        if (n > 1) {
            result = n * countFibonacciNumberRecoursive(n - 1);
        } else if (n == 0) {
            result = 1;
        }
        return result;
    }
}
