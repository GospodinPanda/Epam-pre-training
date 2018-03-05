package by.harshunou.thirdtask.model;

public class FiguresCounter {
    public static int countNumberOfDifferentFigures(int numberToCheck) {
        int tempNumber ;
        int lastNumber;
        int countOfDifferentFigure = 0;
        int numberLength=(""+numberToCheck).length();
        for (int i = 0; i < 10; i++) {
            tempNumber = numberToCheck;
            for (int j = 0; j < numberLength; j++) {
                lastNumber = tempNumber % 10;
                if (i == lastNumber) {
                    countOfDifferentFigure++;
                    break;
                }
                tempNumber /= 10;
            }
        }
        return countOfDifferentFigure;
    }
}

