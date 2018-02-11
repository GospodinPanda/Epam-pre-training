package by.harshunou.thirdtask.model;

import java.util.Random;

public class HeadsOrTails {
    public static final int TOSSES = 1000;

    public static int getTails() {
        int tails = 0;
        Random random = new Random();
        for (int i = 0; i < TOSSES; i++) {
            if (random.nextBoolean()) {
                tails++;
            }
        }
        return tails;
    }
}
