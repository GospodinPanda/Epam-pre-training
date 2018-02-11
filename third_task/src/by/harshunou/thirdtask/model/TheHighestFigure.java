package by.harshunou.thirdtask.model;

public class TheHighestFigure {
    public static int getHighestFigure(int numberToCheck) {
        int highestNumber = 0;
        for (int i = 0; i < numberToCheck; numberToCheck /= 10) {
            int modOfNumber = numberToCheck % 10;
            if (modOfNumber > highestNumber) {
                highestNumber = modOfNumber;
            }
        }
        return highestNumber;
    }
}
