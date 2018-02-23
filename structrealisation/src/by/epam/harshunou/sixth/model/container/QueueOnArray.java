package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.QueueIsEmptyException;
import by.epam.harshunou.sixth.exceptions.QueueOverflowException;

public class QueueOnArray<T> implements AbstractQueue {
    private T[] queueOnArray;
    private int maxSize;
    private int currentSize;
    private int head;
    private int tail;

    public QueueOnArray(int maxSize) {
        this.maxSize = maxSize;
        this.queueOnArray = (T[]) new Object[maxSize];
        this.currentSize = 0;
        this.head = 0;
        this.tail = -1;
    }

    @Override
    public void enqueue(Object ob) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("Queue is full. Cant add any elements");
        }
        tail++;
        queueOnArray[tail] = (T) ob;
        currentSize++;
    }

    @Override
    public Object dequeue() throws QueueIsEmptyException {
        if(isEmpty())
        {
            throw new QueueIsEmptyException("There is nothing to delete");
        }
        currentSize--;
        Object returnValue = queueOnArray[head];
        head++;
        return returnValue;
    }

    @Override
    public Object peek()throws QueueIsEmptyException{
        if(isEmpty())
        {
            throw new QueueIsEmptyException("There is nothing to show");
        }
        return queueOnArray[head];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean isFull() {
        return currentSize == maxSize - 1;
    }
}