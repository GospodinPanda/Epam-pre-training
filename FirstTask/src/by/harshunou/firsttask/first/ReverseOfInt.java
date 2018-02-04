package by.harshunou.firsttask.first;

import static java.lang.Math.pow;

public class ReverseOfInt {
    public static int calculate(int a) {
        int buffer = 0;
        int i = 6;
        buffer += a % 10 * (pow(10, i--));
        buffer += (a /= 10) % 10 * (pow(10, i--));
        buffer += (a /= 10) % 10 * (pow(10, i--));
        buffer += (a /= 10) % 10 * (pow(10, i--));
        buffer += (a /= 10) % 10 * (pow(10, i--));
        buffer += (a /= 10) % 10 * (pow(10, i--));
        buffer += (a /= 10) % 10 * (pow(10, i));
        return buffer;
    }
}

