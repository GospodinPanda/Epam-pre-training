package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.ContainerIsEmptyException;
import by.epam.harshunou.sixth.exceptions.QueueIsEmptyException;

public abstract class AbstractListStructure<T> implements AbstractStructure{
    protected int size = 0;
    protected ValueBox head = null;

    @Override
    public Object peek() throws ContainerIsEmptyException {
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
