package by.epam.preTraining.harshunou.model.searcher;

public class BinarySearcher<T extends Comparable<T>> {
    public int binarySearch(T[] array, T value) {
        return binarySearch(array, value, 0, array.length);
    }

    private int binarySearch(T[] array, T value, int low, int high) {
        while (low <= high) {
            int mid = Math.round((low + high) / 2);
            if (array[mid].compareTo(value) < 0) {
                low = mid + 1;
            } else if (array[mid].compareTo(value) > 0) {
                high = mid - 1;
            } else if (array[mid].compareTo(value) == 0) {
                return mid;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(T[] array, T value) {
        return binarySearchRecursive(array, value,0,array.length);
    }

    private int binarySearchRecursive(T[] array, T value, int low, int high) {
        int mid = Math.round((low + high) / 2);

        if (high < low) {
            return -1;
        }
        if (value.compareTo(array[mid]) == 0) {
            return mid;
        } else if (value.compareTo((array[mid])) < 0) {
            return binarySearchRecursive(array, value, low, mid - 1);
        } else {
            return binarySearchRecursive(array, value, mid + 1, high);
        }
    }
}
