package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.QueueIsEmptyException;

public class QueueOnList<T> extends AbstractListStructure implements AbstractQueue {
    private ValueBox tail = null;


    @Override
    public void enqueue(Object ob) {
        ValueBox<T> valueBox = new ValueBox<>();
        valueBox.setValue(ob);
        if (head == null) {
            head = valueBox;
        } else {
            tail.setNext(valueBox);
        }
        tail = valueBox;
        size++;
    }

    @Override
    public Object dequeue() {
        T tempValueBox = (T) head.getValue();
        head = (ValueBox<T>) head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return tempValueBox;
    }


}
