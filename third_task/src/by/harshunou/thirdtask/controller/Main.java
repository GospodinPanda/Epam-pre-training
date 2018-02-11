package by.harshunou.thirdtask.controller;

import by.harshunou.thirdtask.model.*;
import by.harshunou.thirdtask.view.Printer;

public class Main {

    public static void main(String[] args) {
        Printer.print("The count of Tails is: ");
        Printer.print(HeadsOrTails.getTails());
        Printer.print("The series of tests of 'isPrime' method is below: ");
        Printer.print(CheckForPrime.isPrime(2));
        Printer.print(CheckForPrime.isPrime(1));
        Printer.print(CheckForPrime.isPrime(7));
        Printer.print(CheckForPrime.isPrime(10));
        Printer.print(CheckForPrime.isPrime(1234534));
        Printer.print(CheckForPrime.isPrime(4));
        Printer.print(CheckForPrime.isPrime(3));
        Printer.print("The highest figure of a number check: ");
        Printer.print(TheHighestFigure.getHighestFigure(245342328));
        Printer.print("Tests for 'Perfect' number");
        Printer.print("Test for 6");
        Printer.print(CheckForPerfection.isPerfect(6));
        Printer.print("Test for 28");
        Printer.print(CheckForPerfection.isPerfect(28));
        Printer.print("Test for 496");
        Printer.print(CheckForPerfection.isPerfect(496));
        Printer.print("Test for 8128");
        Printer.print(CheckForPerfection.isPerfect(8128));
        Printer.print("Test for 8129");
        Printer.print(CheckForPerfection.isPerfect(8129));
        Printer.print("Tests for palindrome numbers");
        Printer.print("Tests for 1234321");
        Printer.print(CheckForPalindrome.isPalindrome(1234321));
        Printer.print("Tests for 1231221");
        Printer.print(CheckForPalindrome.isPalindrome(1231221));
        Printer.print("Tests for prime dividers. 51");
        Printer.print(FindAllPrimeDividers.findPrimeDividers(51));
        Printer.print("Tests for different figures");
        Printer.print(CheckCountOfFigures.getNumberOfDifferentFigures(12344835));
        Printer.print("Tests for NODFinder");
        Printer.print(NODFinder.findNOD(1, 10));
        Printer.print(NODFinder.findNOD(5, 10));
        Printer.print(NODFinder.findNOD(24, 24));
        Printer.print(NODFinder.findNOD(24, 24));
        Printer.print("Tests for NOKFinder");
        Printer.print(NOKFinder.findNOK(48, 24));


    }
}
