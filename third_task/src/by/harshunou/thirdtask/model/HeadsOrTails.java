package by.harshunou.thirdtask.model;

import java.util.Random;

public class HeadsOrTails {

    public static int getTails(int tosses) {
        int tails = 0;
        Random random = new Random();
        for (int i = 0; i < tosses; i++) {
            if (random.nextBoolean()) {
                tails++;
            }
        }
        return tails;
    }
}
