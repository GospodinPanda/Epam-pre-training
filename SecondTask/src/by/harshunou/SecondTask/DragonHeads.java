package by.harshunou.SecondTask;

public class DragonHeads {
    public static final int MATURE_DRAGON_HEADS_COUNT = 600;
    public static final int OLD_DRAGON_HEADS_COUNT = 800;
    public static final int MATURE_DRAGON_AGE = 200;
    public static final int OLD_DRAGON_AGE = 300;
    public static final int MATURE_DRAGON_HEADS_INCOME = 3;
    public static final int OLD_DRAGON_HEADS_INCOME = 2;

    public static int dragonHeadsCounter(int n) {

        int heads = 3;
        if (n >= 0 && n < MATURE_DRAGON_AGE) {
            heads += n * MATURE_DRAGON_HEADS_INCOME;
        } else if (n >= MATURE_DRAGON_AGE && n < OLD_DRAGON_AGE) {
            heads += MATURE_DRAGON_HEADS_COUNT + ((n - MATURE_DRAGON_AGE) * OLD_DRAGON_HEADS_INCOME);
        } else if (n >= OLD_DRAGON_AGE) {
            heads += OLD_DRAGON_HEADS_COUNT + (n - OLD_DRAGON_AGE);
        }
        return heads;
    }

    public static int dragonEyesCounter(int n) {
        return dragonHeadsCounter(n) * 2;
    }
}
