package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.StackIsEmptyException;
import by.epam.harshunou.sixth.exceptions.StackOverflowException;

public class StackOnDynArray<T> implements AbstractStack {
    private int maxSize;
    private T[] stackArray;
    private int top;

    public StackOnDynArray(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }

    @Override
    public void push(T ob) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException();
        }
        stackArray[++top] = ob;

    }

    @Override
    public T pop()throws StackIsEmptyException {
        if(isEmpty()){
            throw new StackIsEmptyException();
        }
        return stackArray[top--];
    }

    @Override
    public T peek() throws StackIsEmptyException {
        if(isEmpty())
        {
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
        return top > maxSize;
    }
    private 
}
