package by.epam.preTraining.harshunou.controller;

import by.epam.preTraining.harshunou.model.logic.TextWorker;
import by.epam.preTraining.harshunou.utils.filework.FileWorker;
import by.epam.preTraining.harshunou.view.Printer;

import java.io.FileNotFoundException;

public class Main {
//TBH everything was done in a hurry. So here are a lot of things that might do harm or might look like strange 4:24 AM
    public static void main(String[] args) {
        Printer printer = new Printer();
        try {

            TextWorker textWorker = new TextWorker(FileWorker.readFile("C:\\Users\\SomSom\\IdeaProjects\\task9" +
                    "\\src\\by\\epam\\preTraining\\harshunou\\files\\test.txt"));
            printer.print(textWorker.getText());
            printer.print(textWorker.changeFirstAndLast());
            printer.print(textWorker.deleteConsonantWords(7));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
