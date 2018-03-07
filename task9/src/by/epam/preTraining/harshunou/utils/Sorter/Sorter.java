package by.epam.preTraining.harshunou.utils.Sorter;

import java.util.Arrays;

public class Sorter<T extends Comparable<T>> {
    //O(N) best. O(N*N) worst
    public T[] bubbleSort(T[] array) {
        boolean flag;
        for (int i = 0; i < array.length - 1; i++) {
            flag = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    swap(array, j, j - 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return array;
    }

    //O(N) best. O(N*N) worst
    public T[] insertionSort(T[] array) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                    swap(array, j, j - 1);
                }
            }
        }
        return array;
    }

    //O(N*N)
    public T[] selectionSort(T[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[minIndex].compareTo(array[j]) > 0) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
        return array;
    }

    //O(Nlog(n))
    //рекурсивная функция сортировки частей массива
    public T[] mergeSort(T[] array) {
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        T[] array1 = Arrays.copyOfRange(array, 0, mid);
        T[] array2 = Arrays.copyOfRange(array, mid, array.length);
        return merge(mergeSort(array1), mergeSort(array2));
    }

    //слияние двух массивов в один отсортированный
    private T[] merge(T[] array1, T[] array2) {
        int len_1 = array1.length;
        int len_2 = array2.length;
        int commonSize = len_1 + len_2;
        T[] result = (T[]) new Comparable[commonSize];
        int iterator1 = 0;
        int iterator2 = 0;
        for (int i = 0; i < commonSize; i++) {
            if (iterator2 < len_2 && iterator1 < len_1) {
                if (array1[iterator1].compareTo(array2[iterator2]) > 0) {
                    result[i] = array2[iterator2++];
                } else {
                    result[i] = array1[iterator1++];
                }
            } else if (iterator2 < len_2) {
                result[i] = array2[iterator2++];
            } else {
                result[i] = array1[iterator1++];
            }
        }
        return result;
    }


    //O(Nlog(n))
    public T[] quickSortWithRecursion(T[] array) {
        return quickSortWithRecursion(array, 0, array.length - 1);
    }

    private T[] quickSortWithRecursion(T[] array, int start, int end) {
        if (start >= end)
            return null;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i].compareTo(array[cur])) < 0) {
                i++;
            }
            while (j > cur && (array[cur].compareTo(array[j]) < 0)) {
                j--;
            }
            if (i < j) {
                swap(array, i, j);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        quickSortWithRecursion(array, start, cur);
        quickSortWithRecursion(array, cur + 1, end);
        return array;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
