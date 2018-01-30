package by.harshunou.firsttask.first;

public class EasySwap {
    public static void SwapInts(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The first one " + a + "    The second one " + b);
    }
}
