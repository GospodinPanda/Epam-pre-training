package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.QueueIsEmptyException;
import by.epam.harshunou.sixth.exceptions.QueueOverflowException;

public class QueueOnArray<T> extends AbstractArrayStructure<T> implements AbstractQueue<T> {

    private int currentSize;
    private int tail;

    @SuppressWarnings("unchecked")
    public QueueOnArray() {
        this.maxSize = STANDART_SIZE;
        this.array = (T[]) new Object[maxSize];
        this.currentSize = 0;
        this.head = 0;
        this.tail = -1;
        this.fixed = false;
    }

    @SuppressWarnings("unchecked")
    public QueueOnArray(int maxSize) {
        this.maxSize = maxSize;
        this.array = (T[]) new Object[maxSize];
        this.currentSize = 0;
        this.head = 0;
        this.tail = -1;
        this.fixed = true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void enqueue(Object ob) throws QueueOverflowException {
        if (isFull()) {
            if (fixed) {
                throw new QueueOverflowException("Queue is full. Cant add any elements");
            }
            doubleSize();
        }
        array[++tail] = (T) ob;
        currentSize++;
    }

    @Override
    public T dequeue() throws QueueIsEmptyException {
        if (isEmpty()) {
            throw new QueueIsEmptyException("There is nothing to delete");
        }
        currentSize--;
        T returnValue = array[head];
        head++;
        return returnValue;
    }
}
