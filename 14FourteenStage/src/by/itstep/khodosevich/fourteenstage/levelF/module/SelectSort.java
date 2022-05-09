package by.itstep.khodosevich.fourteenstage.levelF.module;

import java.util.Arrays;

import static by.itstep.khodosevich.fourteenstage.levelF.module.Swap.*;

public class SelectSort {

    private SelectSort() {
    }

    public static boolean selectSortAsc(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        selectSortAsc(array, 0, array.length - 1);
        return true;
    }

    public static boolean selectSortAsc(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start >= end || start < 0 || end > array.length - 1) {
            return false;
        }

        for (int i = start; i < end; i++) {
            int index = i;
            for (int j = i; j < end + 1; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            if (index != i) {
                swap(array, i, index);
            }
        }
        return true;
    }

    public static boolean selectSortDes(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        selectSortAsc(array, 0, array.length - 1);
        return true;
    }

    public static boolean selectSortDes(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start >= end || start < 0 || end > array.length - 1) {
            return false;
        }

        for (int i = start; i < end; i++) {
            int index = i;
            for (int j = i; j < end + 1; j++) {
                if (array[j] > array[index]) {
                    index = j;
                }
            }

            if (index != i) {
                swap(array, i, index);
            }
        }
        return true;
    }


}
