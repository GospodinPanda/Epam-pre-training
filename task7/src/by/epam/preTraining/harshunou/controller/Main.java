package by.epam.preTraining.harshunou.controller;

import by.epam.preTraining.harshunou.exceptions.CustomTreeIsEmptyException;
import by.epam.preTraining.harshunou.model.container.BinaryTree;
import by.epam.preTraining.harshunou.view.Printer;

public class Main {

    public static void main(String[] args) {
        try {
            BinaryTree<Integer> tree = new BinaryTree<>();
            tree.add(7);
            tree.add(4);
            tree.add(9);
            tree.add(11);
            tree.add(2);
            tree.add(3);
            tree.add(6);
            Printer.print("Size of  tree: " + tree.size());
            Printer.print("Post-order: " + tree.postOrder());
            Printer.print("In-order: " + tree.inOrder());
            Printer.print("Pre-order: " + tree.preOrder());
            Printer.print("Is contains 11: " + tree.contains(11));
            tree.remove(11);
            Printer.print("Pre-order after deleting 11: " + tree.preOrder());
            Printer.print("Is contains 5 after deleting: " + tree.contains(11));
            tree.remove(4);
            Printer.print("Pre-order after deleting 4: " + tree.preOrder());
            tree.remove(9);
            Printer.print("Pre-order after deleting 9: " + tree.preOrder());
            tree.clear();
            Printer.print("Size of  tree after clearing: " + tree.size());
        } catch (CustomTreeIsEmptyException e) {
            e.printStackTrace();
        }
    }
}
