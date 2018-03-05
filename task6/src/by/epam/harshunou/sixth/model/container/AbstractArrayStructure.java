package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.StackIsEmptyException;

public abstract class AbstractArrayStructure<T> implements AbstractStructure {

    protected static int STANDART_SIZE = 10;
    protected T[] array;
    protected int maxSize;
    protected int head;
    protected boolean fixed;
    protected int currentSize;


    public T peek() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException();
        }
        return array[head];
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return head < 0;
    }

    @Override
    public boolean isFull() {
        return head >= maxSize;
    }

    protected void doubleSize() {
        T[] temp = array;
        array = (T[]) new Object[maxSize * 2];
        for (int i = 0; i < maxSize; i++) {
            array[i] = temp[i];
        }
        maxSize *= 2;
    }
}
