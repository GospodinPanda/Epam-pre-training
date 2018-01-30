package by.harshunou.firsttask.first;

public class CheckForSequence {
    public static boolean check(int s) {
        boolean forward = true;
        boolean backward = true;
        int buffer;
        buffer = s % 10;
        s /= 10;
        forward = forward && (buffer >= (s % 10));
        backward = backward && (buffer <= (s % 10));
        buffer = s % 10;
        s /= 10;
        forward = forward && (buffer >= (s % 10));
        backward = backward && (buffer <= (s % 10));
        buffer = s % 10;
        s /= 10;
        forward = forward && (buffer >= (s % 10));
        backward = backward && (buffer <= (s % 10));
        return forward || backward;
    }
}
