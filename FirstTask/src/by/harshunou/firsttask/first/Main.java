package by.harshunou.firsttask.first;

public class Main {

    public static void main(String[] args) {
        // dinosaur in
        int weightInGramms = 2600000;
        System.out.println("First task. The weight of a Dinosaur in kilos:" + HeavyDinosaur.calcInKilo(weightInGramms));
        System.out.println("First task. The weight of a Dinosaur in tons:" + HeavyDinosaur.calcInTons(weightInGramms));

        //two rounds R1>R2. Find sqr of the ring
        int R1 = 5;
        int R2 = 3;
        System.out.println("Second task. The square of the ring is: " + TheRingOfAKing.calcRingsSqr(R1, R2));

        //two ints to swap.
        int a = 6;
        int b = -8;
        EasySwap.SwapInts(a, b);

        //check the number for sequence
        int TrueSequenceForward = 1345;
        int TrueSequenceBackward = 5432;
        int FalseSequenceBackward = 1435;
        System.out.println("Check for the True Backward Sequence: "+CheckForSequence.check(TrueSequenceBackward));
        System.out.println("Check for the True Forward Sequence: "+CheckForSequence.check(TrueSequenceForward));
        System.out.println("Check for the False Backward Sequence: "+CheckForSequence.check(FalseSequenceBackward));

        //get the sum and comp of the figures in the number
        int fiveFigures = 12213;
        System.out.println("Sum is: "+SumAndComp.summ(fiveFigures));
        System.out.println("Comp is: "+SumAndComp.composition(fiveFigures));

        //get the arifm and geom of the figures in the number
        int sixFigures = 123456;
        System.out.println("Average: " + ArifmAndGeom.arifm(sixFigures));
        System.out.println("The geometric mean: " + ArifmAndGeom.geometr(sixFigures));

        //reverse int with 7 figures in it
        int sevenFigures = 1234567;
        System.out.println("Reversed number is:"+ReverseOfInt.calculate(sevenFigures));
    }
}
