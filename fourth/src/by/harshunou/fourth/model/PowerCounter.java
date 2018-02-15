package by.harshunou.fourth.model;

public class PowerCounter {
    public static double countPower(double number, int power) {
        double result = 1;
        if (power == 0) {
            result = 1;
        }
        if (power < 0) {
            result = 1.0 / countPower(number, -power);
        } else if (power > 0) {
            result = number * countPower(number, power - 1);
        }
        return result;
    }
}
