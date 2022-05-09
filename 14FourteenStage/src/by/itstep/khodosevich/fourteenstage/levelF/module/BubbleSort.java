package by.itstep.khodosevich.fourteenstage.levelF.module;

import static by.itstep.khodosevich.fourteenstage.levelF.module.Swap.*;

public class BubbleSort {
    private BubbleSort() {
    }

    public static boolean bubbleSortAsc(int[] array) {
        if (array == null || array.length < 2) {
            return false;
        }
        bubbleSortAsc(array, 0, array.length - 1);
        return true;
    }

    public static boolean bubbleSortDes(int[] array) {
        if (array == null || array.length < 2) {
            return false;
        }
        bubbleSortDes(array, 0, array.length - 1);
        return true;
    }

    public static boolean bubbleSortAsc(int[] array, int start, int end) {
        if (array == null || array.length < 2 || start < 0 || end > array.length - 1 || start >= end) {
            return false;
        }

        for (int i = start; i < end; i++) {
            boolean isAlreadySorted = true;
            for (int j = start; j < end; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    isAlreadySorted = false;
                }
            }

            if (isAlreadySorted) {
                return isAlreadySorted;
            }
        }
        return true;
    }

    public static boolean bubbleSortDes(int[] array, int start, int end) {
        if (array == null || array.length < 2 || start < 0 || end > array.length - 1 || start >= end) {
            return false;
        }

        for (int i = start; i < end; i++) {
            boolean isAlreadySorted = true;
            for (int j = start; j < end; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                    isAlreadySorted = false;
                }
            }
            if (isAlreadySorted) {
                return isAlreadySorted;
            }
        }
        return true;
    }
}
