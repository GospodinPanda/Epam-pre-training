package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.QueueIsEmptyException;
import by.epam.harshunou.sixth.exceptions.QueueOverflowException;

public class QueueOnList<T> implements AbstractQueue {
    private QueueValueBox head=null;
    private QueueValueBox tail=null;
    int size = 0;


    @Override
    public void enqueue(Object ob) throws QueueOverflowException {
        QueueValueBox<T> valueBox = new QueueValueBox<>();
        valueBox.setValue(ob);
        if (head == null) {
            head = valueBox;
        } else {
            tail.setNext(valueBox);
        }
        tail.setNext(valueBox);
        size++;
    }

    @Override
    public Object dequeue() throws QueueIsEmptyException {
        T tempValueBox =(T)head.getValue();
        head=(QueueValueBox<T>)head.getNext();
        if(head==null)
        {
            tail=null;
        }
        size--;
        return tempValueBox;
    }

    @Override
    public Object peek() throws QueueIsEmptyException {
        return head.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
//is it necessary?
    @Override
    public boolean isFull() {
        return false;
    }
}
