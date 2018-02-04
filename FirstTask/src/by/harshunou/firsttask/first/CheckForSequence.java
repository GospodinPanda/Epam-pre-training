package by.harshunou.firsttask.first;

public class CheckForSequence {
    public static boolean isSequence(int s) {
        boolean forward = true;
        boolean backward = true;
        int buffer = 0;
        forward = forward && ((buffer = s % 10) >= ((s /= 10) % 10));
        backward = backward && (buffer <= ((s) % 10));
        forward = forward && ((buffer = s % 10) >= ((s /= 10) % 10));
        backward = backward && (buffer <= (s % 10));
        forward = forward && ((buffer = s % 10) >= ((s /= 10) % 10));
        backward = backward && (buffer <= (s % 10));
        return forward || backward;
    }
}
