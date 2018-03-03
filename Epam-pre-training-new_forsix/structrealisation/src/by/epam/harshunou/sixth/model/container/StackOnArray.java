package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.StackIsEmptyException;
import by.epam.harshunou.sixth.exceptions.StackOverflowException;

public class StackOnArray<T> extends AbstractArrayStructure<T> implements AbstractStack<T> {


    public StackOnArray() {
        this.maxSize=STANDART_SIZE;
        this.array=(T[]) new Object[maxSize];
        this.head = -1;
        this.fixed = false;
    }

    public StackOnArray(int maxSize) {
        this.maxSize = maxSize;
        this.array = (T[]) new Object[maxSize];
        this.head = -1;
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
        array[++head] = ob;
        currentSize++;
    }

    @Override
    public T pop() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException();
        }
        currentSize--;
        return array[head--];

    }




}
