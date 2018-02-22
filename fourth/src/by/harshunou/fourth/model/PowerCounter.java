package by.harshunou.fourth.model;

public class PowerCounter {
    public static double countPower(double number, int power) {
        double result = 1;
        if (power == 0) {
            return 1;
        }
        if (power < 0) {
            result = 1.0 / countPower(number, -power);
        } else {
            result = number * countPower(number, power - 1);
        }
        return result;
    }

    public static double countPowerIterative(double number, int power) {
        double result = 1;
        if (power == 0) {
            return 1;
        }
        if (power > 0) {
            for (int i = 0; i < power; i++) {
                result *= number;
            }
        } else {
            power = -power;
            for (int i = 0; i < power; i++) {
                result /= number;
            }
        }
        return result;
    }
}
