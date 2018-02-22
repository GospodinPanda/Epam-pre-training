package by.harshunou.fourth.model;

import by.harshunou.fourth.view.Printer;

public class HanoiTower {
    private static String resultString = "";
    public static String moveDisks(int count, char a, char b, char c) {

        if (count > 0) {
            moveDisks(count - 1, a, b, c);
            resultString += "Moving from " + a + " to " + b+" ";
            moveDisks(count - 1, b, c, a);
        }
        return resultString;
    }
}
