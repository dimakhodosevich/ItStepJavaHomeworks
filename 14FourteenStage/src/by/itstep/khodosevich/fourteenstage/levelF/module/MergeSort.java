package by.itstep.khodosevich.fourteenstage.levelF.module;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {3, 4, 78, 1, -1, 0, 0};
        mergeSortDes(array);
        System.out.println(Arrays.toString(array));
        System.out.println("---------");
        int[] array2 = {3, 4, 78, 1, -1, 0, 0};
        mergeSortDes(array2, 2, 5);
        System.out.println(Arrays.toString(array2));
    }

    private MergeSort() {
    }

    public static void mergeSortAsc(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start > end || start < 0 || end > array.length - 1) {
            throw new RuntimeException();
        }

        int[] newArray = new int[end - start + 1];
        for (int i = start, j = 0; i < end + 1; i++, j++) {
            newArray[j] = array[i];
        }

        mergeSortAsc(newArray);

        for (int i = start, j = 0; i < end + 1; i++, j++) {
            array[i] = newArray[j];
        }
    }

    public static void mergeSortAsc(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        if (array.length < 2) {
            return;
        }

        int length = array.length;
        int mid = array.length / 2;

        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = mid; i < length; i++) {
            rightHalf[i - mid] = array[i];
        }

        mergeSortAsc(leftHalf);
        mergeSortAsc(rightHalf);
        mergeAsc(array, leftHalf, rightHalf);
    }

    public static void mergeAsc(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            k++;
            j++;
        }
    }

    public static void mergeSortDes(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start > end || start < 0 || end > array.length - 1) {
            throw new RuntimeException();
        }


        int[] newArray = new int[end - start + 1];
        for (int i = start, j = 0; i < end + 1; i++, j++) {
            newArray[j] = array[i];
        }

        mergeSortDes(newArray);

        for (int i = start, j = 0; i < end + 1; i++, j++) {
            array[i] = newArray[j];
        }
    }

    public static void mergeSortDes(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        if (array.length < 2) {
            return;
        }

        int length = array.length;
        int mid = array.length / 2;

        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = mid; i < length; i++) {
            rightHalf[i - mid] = array[i];
        }

        mergeSortDes(leftHalf);
        mergeSortDes(rightHalf);
        mergeDes(array, leftHalf, rightHalf);
    }

    public static void mergeDes(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] >= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            k++;
            j++;
        }
    }

}
