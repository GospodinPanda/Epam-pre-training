package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.StackIsEmptyException;
import by.epam.harshunou.sixth.exceptions.StackOverflowException;

public class StackOnArray<T> implements AbstractStack<T> {
    private static int STANDART_SIZE = 10;
    private int maxSize;
    private T[] stackArray;
    private int top;
    private boolean fixed;

    public StackOnArray() {
        this.maxSize = STANDART_SIZE;
        this.stackArray = (T[]) new Object[STANDART_SIZE];
        maxSize = STANDART_SIZE;
        this.top = -1;
        this.fixed = false;
    }

    public StackOnArray(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
        this.fixed = true;
    }

    @Override
    public void push(T ob) throws StackOverflowException {
        if (isFull()) {
            if (fixed) {
                throw new StackOverflowException();
            }
            doubleSize();
        }
        stackArray[++top] = ob;
    }

    @Override
    public T pop() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException();
        }
        return stackArray[top--];
    }

    @Override
    public T peek() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException();
        }
        return stackArray[top];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public boolean isFull() {
        return top >= maxSize;
    }

    private void doubleSize() {
        T[] temp = stackArray;
        stackArray = (T[]) new Object[maxSize * 2];
        for (int i = 0; i < maxSize; i++) {
            stackArray[i] = temp[i];
        }
        maxSize *= 2;
    }
}
