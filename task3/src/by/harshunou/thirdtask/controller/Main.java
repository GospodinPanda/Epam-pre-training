package by.harshunou.thirdtask.controller;

import by.harshunou.thirdtask.model.*;
import by.harshunou.thirdtask.view.Printer;

public class Main {

    public static void main(String[] args) {
        Printer.print("The count of Tails is: ");
        Printer.print(HeadsOrTails.getTails(1000));
        Printer.print("The series of tests of 'isPrime' method is below: ");
        Printer.print(PrimeChecker.checkPrime(2));
        Printer.print(PrimeChecker.checkPrime(1));
        Printer.print(PrimeChecker.checkPrime(7));
        Printer.print(PrimeChecker.checkPrime(10));
        Printer.print(PrimeChecker.checkPrime(1234534));
        Printer.print(PrimeChecker.checkPrime(4));
        Printer.print(PrimeChecker.checkPrime(3));
        Printer.print("The highest figure of a number check: ");
        Printer.print(TheHighestFigure.findHighestFigure(245342328));
        Printer.print("Tests for 'Perfect' number");
        Printer.print("Test for 6");
        Printer.print(PerfectionChecker.checkPerfection(6));
        Printer.print("Test for 28");
        Printer.print(PerfectionChecker.checkPerfection(28));
        Printer.print("Test for 496");
        Printer.print(PerfectionChecker.checkPerfection(496));
        Printer.print("Test for 8128");
        Printer.print(PerfectionChecker.checkPerfection(8128));
        Printer.print("Test for 8129");
        Printer.print(PerfectionChecker.checkPerfection(8129));
        Printer.print("Tests for palindrome numbers");
        Printer.print("Tests for 1234321");
        Printer.print(PalindromeChecker.checkPalindrome(1234321));
        Printer.print("Tests for 1231221");
        Printer.print(PalindromeChecker.checkPalindrome(1231221));
        Printer.print("Tests for prime dividers. 51");
        Printer.print(PrimeDividersFinder.findPrimeDividers(51));
        Printer.print("Tests for different figures");
        Printer.print(FiguresCounter.countNumberOfDifferentFigures(12344835));
        Printer.print("Tests for NODFinder");
        Printer.print(NODFinder.findNOD(1, 10));
        Printer.print(NODFinder.findNOD(5, 10));
        Printer.print(NODFinder.findNOD(24, 24));
        Printer.print(NODFinder.findNOD(24, 24));
        Printer.print("Tests for NOKFinder");
        Printer.print(NOKFinder.findNOK(48, 24));


    }
}
