package by.epam.harshunou.sixth.model.container;

import by.epam.harshunou.sixth.exceptions.StackIsEmptyException;
import by.epam.harshunou.sixth.exceptions.StackOverflowException;

public interface AbstractStack<T> extends AbstractStructure{

    void push(T ob) throws StackOverflowException;


    T pop()throws StackIsEmptyException;



}
