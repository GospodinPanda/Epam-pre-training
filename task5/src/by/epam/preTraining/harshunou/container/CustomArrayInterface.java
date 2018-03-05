package by.epam.preTraining.harshunou.container;

import by.epam.preTraining.harshunou.exceptions.WrongInputException;

public interface CustomArrayInterface<T> {
    public void addElement(T element);

    public void addElement(T[] elements);

    public void clear();

    public void remove(int index) throws WrongInputException;

    public int size();

    public boolean isEmpty();

    public T get(int index) throws WrongInputException;

    public boolean contains(T ob) throws WrongInputException;

    public boolean contains(T[] obs) throws WrongInputException;
}
