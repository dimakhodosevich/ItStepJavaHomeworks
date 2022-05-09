package by.itstep.khodosevich.fourteenstage.levelF.module;


import static by.itstep.khodosevich.fourteenstage.levelF.module.Swap.*;

public class QuickSort {

    private QuickSort() {
    }

    public static void quickSortAsc(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }
        quickSortAsc(array, 0, array.length - 1);
    }

    public static void quickSortAsc(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start < 0 || end > array.length - 1 || start > end) {
            throw new RuntimeException();
        }

        if (start >= end) {
            return;
        }

        int pivot = partitionAsc(array, start, end);
        quickSortAsc(array, start, pivot - 1);
        quickSortAsc(array, pivot, end);
    }

    private static int partitionAsc(int[] array, int start, int end) {
        int leftPointer = start;
        int rightPointer = end;
        int element = array[(start + end) / 2];

        while (leftPointer <= rightPointer) {

            while (array[leftPointer] < element) {
                leftPointer++;
            }
            while (array[rightPointer] > element) {
                rightPointer--;
            }

            if (leftPointer <= rightPointer) {
                swap(array, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }

        return leftPointer;
    }


    public static void quickSortDes(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }
        quickSortDes(array, 0, array.length - 1);
    }

    public static void quickSortDes(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start < 0 || end > array.length - 1 || start > end) {
            throw new RuntimeException();
        }

        if (start >= end) {
            return;
        }

        int pivot = partitionDes(array, start, end);
        quickSortDes(array, start, pivot - 1);
        quickSortDes(array, pivot, end);
    }

    private static int partitionDes(int[] array, int start, int end) {
        int leftPointer = start;
        int rightPointer = end;
        int element = array[(start + end) / 2];

        while (leftPointer <= rightPointer) {

            while (array[leftPointer] > element) {
                leftPointer++;
            }
            while (array[rightPointer] < element) {
                rightPointer--;
            }

            if (leftPointer <= rightPointer) {
                swap(array, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }

        return leftPointer;
    }

}
