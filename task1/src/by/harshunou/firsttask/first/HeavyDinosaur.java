package by.harshunou.firsttask.first;

public class HeavyDinosaur {
    public static final double GRAM_PER_KILO = 1000.0;
    public static final double GRAM_PER_TONE = 1000000.0;

    public static double calcInKilo(int a) {
        return a / GRAM_PER_KILO;
    }

    public static double calcInTons(int a) {
        return a / GRAM_PER_TONE;
    }
}
