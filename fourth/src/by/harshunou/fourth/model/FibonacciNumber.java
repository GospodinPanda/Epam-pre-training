package by.harshunou.fourth.model;

import static java.lang.Math.abs;

public class FibonacciNumber {
    public static int countFibonacciNumberRecoursive(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        return countFibonacciNumberRecoursive(number - 1) + countFibonacciNumberRecoursive(number - 2);
    }

    public static int fibonacciIterative(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        int fibonacci = 1;
        int previousFibonacci = 1;
        for (int i = 3; i < number; i++) {
            int temp = fibonacci;
            fibonacci += previousFibonacci;
            previousFibonacci = temp;
        }
        return fibonacci;
    }
}
