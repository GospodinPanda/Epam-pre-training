package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.QueueIsEmptyException;
import by.epam.harshunou.sixth.exceptions.QueueOverflowException;

public interface AbstractQueue<T> {
    void enqueue(T ob)throws QueueOverflowException;

    T dequeue() throws QueueIsEmptyException;

    T peek()throws QueueIsEmptyException;

    int size();

    boolean isEmpty();

    boolean isFull();
}
