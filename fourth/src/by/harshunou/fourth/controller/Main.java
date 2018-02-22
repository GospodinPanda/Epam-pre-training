package by.harshunou.fourth.controller;

import by.harshunou.fourth.model.*;
import by.harshunou.fourth.view.Printer;

public class Main {

    public static void main(String[] args) {
        Printer.print(HanoiTower.moveDisks(3, 'A', 'B', 'C'));
        Printer.print(FibonacciNumber.countFibonacciNumberRecoursive(7));
        Printer.print(FibonacciNumber.fibonacciIterative(7));
        Printer.print(SumOfDigits.countDigitsSum(543));
        Printer.print(SumOfDigits.countDigitsSumIterative(543));
        Printer.print(EqualsChecker.checkEquality(543,12));
        Printer.print(EqualsChecker.checkEqualityIterative(543,12));
        Printer.print(EqualsChecker.checkEquality(543,10));
        Printer.print(EqualsChecker.checkEqualityIterative(543,10));
        Printer.print(PowerCounter.countPower(3,3));
        Printer.print(PowerCounter.countPower(3,-3));
        Printer.print(PowerCounter.countPowerIterative(3,3));
        Printer.print(PowerCounter.countPowerIterative(3,-3));
    }
}
