package by.harshunou.firsttask.first;

public class Main {

    public static void main(String[] args) {
        // dinosaur in
        int weightInGrams = 2600000;
        System.out.println("First task. The weight of a Dinosaur in kilos:" + HeavyDinosaur.calcInKilo(weightInGrams));
        System.out.println("First task. The weight of a Dinosaur in tons:" + HeavyDinosaur.calcInTons(weightInGrams));

        //two rounds R1>R2. Find sqr of the ring
        int R1 = 5;
        int R2 = 3;
        System.out.println("Second task. The square of the ring is: " + TheRingOfAKing.calcRingsSqr(R1, R2));

        //two ints to swap.
        int a = 6;
        int b = -8;
        EasySwap.swapInts(a, b);

        //check the number for sequence
        int TrueSequenceForward = 1345;
        int TrueSequenceBackward = 5432;
        int FalseSequenceBackward = 1435;
        System.out.println("Check for the True Backward Sequence: " + CheckForSequence.isSequence(TrueSequenceBackward));
        System.out.println("Check for the True Forward Sequence: " + CheckForSequence.isSequence(TrueSequenceForward));
        System.out.println("Check for the False Backward Sequence: " + CheckForSequence.isSequence(FalseSequenceBackward));

        //get the sum and comp of the figures in the number
        int fiveFigures = 12213;
        System.out.println("Sum is: " + SumAndComp.summ(fiveFigures));
        System.out.println("Comp is: " + SumAndComp.composition(fiveFigures));

        //get the arithm and geom of the figures in the number
        int sixFigures = 123456;
        System.out.println("Average: " + ArithmAndGeom.countArithm(sixFigures));
        System.out.println("The geometric mean: " + ArithmAndGeom.countGeom(sixFigures));

        //reverse int with 7 figures in it
        int sevenFigures = 1234567;
        System.out.println("Reversed number is:" + ReverseOfInt.calculate(sevenFigures));
    }
}
