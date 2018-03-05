package by.epam.harshunou.sixth.controller;

import by.epam.harshunou.sixth.exceptions.AbstractStructuresException;
import by.epam.harshunou.sixth.model.PalindromeChecker;
import by.epam.harshunou.sixth.model.container.*;
import by.epam.harshunou.sixth.view.Printer;

public class Main {

    public static void main(String[] args) {
        try {
            Printer.print("stack on array \n");
            AbstractStack<Integer> stackArray =new StackOnArray<>();
            stackArray.push(1);
            stackArray.push(4);
            stackArray.push(3);
            stackArray.push(2);
            Printer.print(stackArray.peek());
            Printer.print(stackArray.pop());
            Printer.print(stackArray.peek());
            Printer.print("stack on list \n");
            AbstractStack<Integer> stackList =new StackOnList<Integer>();
            stackList.push(1);
            stackList.push(4);
            stackList.push(3);
            stackList.push(2);
            Printer.print(stackList.peek());
            Printer.print(stackList.pop());
            Printer.print(stackList.peek());
            Printer.print("queue on array\n");
            AbstractQueue<Integer> queueArray = new QueueOnArray<>();
            queueArray.enqueue(5);
            queueArray.enqueue(3);
            queueArray.enqueue(7);
            queueArray.enqueue(9);
            queueArray.enqueue(0);
            Printer.print(queueArray.peek());
            Printer.print(queueArray.dequeue());
            Printer.print(queueArray.peek());
            Printer.print("queue on list\n");
            AbstractQueue<Integer> queueList =new QueueOnList<>();
            queueList.enqueue(5);
            queueList.enqueue(3);
            queueList.enqueue(7);
            queueList.enqueue(9);
            queueList.enqueue(0);
            Printer.print(queueList.peek());
            Printer.print(queueList.dequeue());
            Printer.print(queueList.dequeue());
            Printer.print(queueList.peek());


            Printer.print(PalindromeChecker.checkPalindrome("alila"));
            Printer.print(PalindromeChecker.checkPalindrome("alilaaw"));
        } catch (AbstractStructuresException e)
        {
            e.printStackTrace();
        }
    }
}
