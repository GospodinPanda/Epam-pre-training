package by.harshunou.firsttask.first;

import static java.lang.Math.pow;

public class ArithmAndGeom {
    public static final double FIGURES_COUNT = 6.0;

    public static double countArithm(int a) {
        int arithm = 0;
        arithm += a % 10;
        arithm += (a /= 10) % 10;
        arithm += (a /= 10) % 10;
        arithm += (a /= 10) % 10;
        arithm += (a /= 10) % 10;
        arithm += (a /= 10) % 10;
        return arithm / FIGURES_COUNT;
    }

    public static double countGeom(int a) {
        int geometr = 1;
        geometr *= a % 10;
        geometr *= (a /= 10) % 10;
        geometr *= (a /= 10) % 10;
        geometr *= (a /= 10) % 10;
        geometr *= (a /= 10) % 10;
        geometr *= (a /= 10) % 10;
        return pow(geometr, (1 / FIGURES_COUNT));
    }
}
