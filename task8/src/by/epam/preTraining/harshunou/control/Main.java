package by.epam.preTraining.harshunou.control;

import by.epam.preTraining.harshunou.model.searcher.BinarySearcher;
import by.epam.preTraining.harshunou.model.searcher.LinearSearcher;
import by.epam.preTraining.harshunou.model.sorter.Sorter;
import by.epam.preTraining.harshunou.view.Printer;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int NUMBER=6;
    public static void main(String[] args) {

        Integer[] arrayA=new Integer[NUMBER];
        Integer[] arrayB=new Integer[NUMBER];
        Integer[] arrayC=new Integer[NUMBER];
        Integer[] arrayD=new Integer[NUMBER];
        Integer[] arrayE=new Integer[NUMBER];
        Random random = new Random();
        for(int i=0;i<NUMBER;i++){
            arrayA[i]= random.nextInt(25);
        }
        for(int i=0;i<NUMBER;i++){
            arrayB[i]= random.nextInt(25);
        }
        for(int i=0;i<NUMBER;i++){
            arrayC[i]= random.nextInt(25);
        }
        for(int i=0;i<NUMBER;i++){
            arrayD[i]= random.nextInt(25);
        }
        for(int i=0;i<NUMBER;i++){
            arrayE[i]= random.nextInt(25);
        }
        Printer.print("Array A");
        for (Integer elemA :
                arrayA) {
            Printer.print(elemA);
        }
        Printer.print("Array B");
        for (Integer elemA :
                arrayA) {
            Printer.print(elemA);
        }
        Sorter<Integer> sorter =new Sorter<>();
        Printer.print(Arrays.toString(sorter.mergeSort(arrayA)));
        Printer.print(Arrays.toString(sorter.selectionSort(arrayB)));
        Printer.print(Arrays.toString(sorter.bubbleSort(arrayD)));
        Printer.print(Arrays.toString(sorter.quickSortWithRecursion(arrayC)));
        Printer.print(Arrays.toString(sorter.insertionSort(arrayE)));

        BinarySearcher<Integer> searcher =new BinarySearcher<>();
        LinearSearcher<Integer> searcher1 =new LinearSearcher<>();
        Printer.print(searcher.binarySearch(arrayA,11));
        Printer.print(searcher.binarySearchRecursive(arrayB, 11));
        Printer.print(searcher1.searchIterative(arrayC, 10));
    }
}
