package by.harshunou.SecondTask;

import java.util.Random;

public class MoodSensor {
    public static final int RANDOM_LIMIT=10;
    public static String generateMood() {
        Random random = new Random(System.currentTimeMillis());
        switch (random.nextInt(RANDOM_LIMIT)) {
            case 0:
                return ":)";
            case 1:
                return ":(";
            case 2:
                return ":/";
            case 3:
                return ":c";
            case 4:
                return ":s";
            case 5:
                return ":*";
            case 6:
                return ":o";
            case 7:
                return ":O";
            case 8:
                return ":X";
            case 9:
                return "T_T";
            default:
                return "^_^";
        }
    }
}
