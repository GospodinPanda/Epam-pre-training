package by.epam.preTraining.harshunou.container;

import by.epam.preTraining.harshunou.exceptions.WrongInputException;

import java.util.Arrays;
import java.util.Objects;

public class CustomArray<T> implements CustomArrayInterface<T> {
    private T[] array;
    private int length;

    public CustomArray() {
        this.array = (T[]) new Object[0];
        this.length = 0;
    }

    public CustomArray(T... elements) {
        this.array = (T[]) new Object[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = elements[i];
        }
        length = elements.length;
    }

    public void addElement(T element) {
        T[] temp = array;
        array = (T[]) new Object[++length];
        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }
        array[length - 1] = element;
    }

    public void addElement(T[] elements) {
        for (T elem : elements) {
            addElement(elem);
        }
    }

    public void clear() {
        array = (T[]) new Object[0];
        length = array.length;
    }

    public void remove(int index) throws WrongInputException {
        try {
            T[] temp = array;
            array = (T[]) new Object[temp.length - 1];
            this.length = temp.length - 1;
            for (int i = 0; i < index; i++) {
                    array[i] = temp[i];
            }
            for(int i=index-1;i<array.length;i++)
            {
                array[i]=temp[i+1];
            }
        } catch (IndexOutOfBoundsException e) {
            throw new WrongInputException("There is no such index here");
        }
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public T get(int index) throws WrongInputException {
        try {
            return array[index];
        } catch (IndexOutOfBoundsException e) {
            throw new WrongInputException("There is no such index here.", e);
        }
    }

    public boolean contains(T ob) throws WrongInputException {
        boolean result = false;
        if (ob == null) {
            throw new WrongInputException("Enter an initialised object");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (ob.equals(array[i])) {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean contains(T[] obs) throws WrongInputException {
        for (T ob :
                obs) {
            if (!contains(ob)) {
                return false;
            }

        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray<?> that = (CustomArray<?>) o;
        return length == that.length &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(length);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
