package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.ContainerIsEmptyException;


public interface AbstractStructure<T> {
    int size();

    boolean isEmpty();

    boolean isFull();

    T peek() throws ContainerIsEmptyException;

}
