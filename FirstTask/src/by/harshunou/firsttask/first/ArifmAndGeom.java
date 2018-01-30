package by.harshunou.firsttask.first;

import static java.lang.Math.pow;

public class ArifmAndGeom {
    public static double arifm(int a) {
        int arifm = 0;

        arifm += a % 10;
        a /= 10;
        arifm += a % 10;
        a /= 10;
        arifm += a % 10;
        a /= 10;
        arifm += a % 10;
        a /= 10;
        arifm += a % 10;
        a /= 10;
        arifm += a % 10;
        return arifm / 6.0;
    }

    public static double geometr(int a) {
        int geometr = 1;
        double power = 6.0;
        geometr *= a % 10;
        a /= 10;
        geometr *= a % 10;
        a /= 10;
        geometr *= a % 10;
        a /= 10;
        geometr *= a % 10;
        a /= 10;
        geometr *= a % 10;
        a /= 10;
        geometr *= a % 10;
        return pow(geometr, (1 / power));
    }
}
