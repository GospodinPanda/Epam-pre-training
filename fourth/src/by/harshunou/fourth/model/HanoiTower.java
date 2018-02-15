package by.harshunou.fourth.model;

import by.harshunou.fourth.view.Printer;

public class HanoiTower {
    public static void moveDisks(int count, char a, char b, char c) {
        if (count > 0) {
            moveDisks(count - 1, a, b, c);
            Printer.print("Moving from " + a + " to " + b);
            moveDisks(count - 1, b, c, a);
        }
    }
}
