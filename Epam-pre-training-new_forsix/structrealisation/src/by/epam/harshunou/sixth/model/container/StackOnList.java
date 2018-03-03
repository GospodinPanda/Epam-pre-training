package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.StackIsEmptyException;
import by.epam.harshunou.sixth.exceptions.StackOverflowException;

public class StackOnList<T> extends AbstractListStructure implements AbstractStack {


    public void displayList() {
        ValueBox<T> current = head;
        while (current != null)
            current.toString();
        current = current.getNext();
    }

    @Override
    public void push(Object ob) throws StackOverflowException {
        ValueBox<T> box = new ValueBox<T>();
        box.setValue((T)ob);
        box.setNext(head);
        head = box;
        size++;
    }

    @Override
    public Object pop() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException("Stack is empty");
        }
        ValueBox<T> temp = head;
        head = head.getNext();
        size--;
        return temp;
    }

}
