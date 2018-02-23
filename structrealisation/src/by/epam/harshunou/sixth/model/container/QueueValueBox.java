package by.epam.harshunou.sixth.model.container;

public class QueueValueBox<T> {
    private T value;
    private QueueValueBox<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value =(T) value;
    }

    public QueueValueBox<T> getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = (QueueValueBox<T>) next;
    }
}
