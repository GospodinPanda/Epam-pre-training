package by.harshunou.SecondTask;

import java.util.Scanner;

public class Inputter {
    public static int inputInt(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextInt();
    }

    public static String inputChar(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).next();
    }
}
