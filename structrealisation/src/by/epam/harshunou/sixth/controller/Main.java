package by.epam.harshunou.sixth.controller;

import by.epam.harshunou.sixth.exceptions.AbstractStructuresException;
import by.epam.harshunou.sixth.model.PalindromeChecker;
import by.epam.harshunou.sixth.view.Printer;

public class Main {

    public static void main(String[] args) {
        try {


            Printer.print(PalindromeChecker.checkPalindrome("alila"));
            Printer.print(PalindromeChecker.checkPalindrome("alilaaw"));
        } catch (AbstractStructuresException e)
        {
            e.printStackTrace();
        }
    }
}
