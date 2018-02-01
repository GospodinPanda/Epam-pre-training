package by.harshunou.SecondTask;

public class DragonHeads {
    public static int DragonHeadsCounter(int n) {
        int heads = 3;
        if (n >= 0 && n < 200) {
            heads += n * 3;
        } else if (n >= 200 && n < 300) {
            heads += 200 * 3 + ((n - 200) * 2);
        } else if (n >= 300) {
            heads += 200 * 3 + 100 * 2 + (n - 300);
        }
        return heads;
    }

    public static int DragonEyesCounter(int n) {
        return DragonHeadsCounter(n) * 2;
    }
}
