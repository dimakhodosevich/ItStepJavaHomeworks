package by.itstep.khodosevich.fourteenstage.levelF.module;


public class InsertSort {

    private InsertSort() {
    }

    public static boolean insertSortAsc(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        insertSortAsc(array, 0, array.length - 1);
        return true;
    }

    public static boolean insertSortAsc(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start >= end || start < 0 || end > array.length - 1) {
            return false;
        }

        for (int i = 1 + start; i < end + 1; i++) {
            int element = array[i];
            int j = i - 1;

            while (j >= start && array[j] > element) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                j--;
            }

            array[++j] = element;
        }
        return false;
    }

    public static boolean insertSortDes(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        insertSortDes(array, 0, array.length - 1);
        return true;
    }

    public static boolean insertSortDes(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start >= end || start < 0 || end > array.length - 1) {
            return false;
        }

        for (int i = 1 + start; i < end + 1; i++) {
            int element = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < element) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                j--;
            }

            array[++j] = element;
        }
        return false;
    }

}
