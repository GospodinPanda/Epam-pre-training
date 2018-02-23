package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.StackIsEmptyException;
import by.epam.harshunou.sixth.exceptions.StackOverflowException;

public interface AbstractStack<T> {
    void push(T ob) throws StackOverflowException;

    T pop()throws StackIsEmptyException;

    T peek() throws StackIsEmptyException;

    int size();

    boolean isEmpty();

    boolean isFull();

}
