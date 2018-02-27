package by.epam.harshunou.sixth.model.container;

public class ValueBox<T> {
    private T value;
    private ValueBox<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = (T) value;
    }

    public ValueBox<T> getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = (ValueBox<T>) next;
    }

    @Override
    public String toString() {
        return  ""+value ;
    }
}
