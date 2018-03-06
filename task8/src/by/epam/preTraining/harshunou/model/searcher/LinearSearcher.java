package by.epam.preTraining.harshunou.model.searcher;

//O(N)
public class LinearSearcher<T extends Comparable<T>> {
    public int searchIterative(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }

    public int searchRecursive(T[] array, T value) {
        return searchRecursive(array, value, array.length - 1);
    }

    private int searchRecursive(T[] array, T value, int index) {
        if (index == 0) {
            return -1;
        }
        if (array[index].compareTo(value) == 0) {
            return index;
        }
        return searchRecursive(array, value, index - 1);
    }
}
