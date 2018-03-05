package by.harshunou.firsttask.first;

public class TheRingOfAKing {
    public static double calcRingsSqr(int r1, int r2) {
        return calcRoundSqr(r1) - calcRoundSqr(r2);
    }

    public static double calcRoundSqr(int r) {
        return Math.PI * r * r;
    }
}
