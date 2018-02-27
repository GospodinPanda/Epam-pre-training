package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.StackIsEmptyException;
import by.epam.harshunou.sixth.exceptions.StackOverflowException;

public class StackOnList<T> implements AbstractStack {

    private ValueBox<T> first = null;
    private int size = 0;

    private void insertFirst(T data) {
        ValueBox<T> box = new ValueBox<T>();
        box.setValue(data);
        box.setNext(first);
        first = box;
        size++;
    }

    private ValueBox<T> deleteFirst() {
        ValueBox<T> temp = first;
        first = first.getNext();
        size--;
        return temp;
    }

    public void displayList() {
        ValueBox<T> current = first;
        while (current != null)
            current.toString();
        current = current.getNext();
    }

    @Override
    public void push(Object ob) throws StackOverflowException {
        insertFirst((T) ob);
    }

    @Override
    public Object pop() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException("Stack is empty");
        }
        return deleteFirst();
    }

    @Override
    public Object peek() throws StackIsEmptyException {
        return first;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
