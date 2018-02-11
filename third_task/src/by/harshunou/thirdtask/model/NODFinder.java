package by.harshunou.thirdtask.model;

public class NODFinder {
    public static int findNOD(int first, int second) {
        while (first != second) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }
        return first;
    }
}
