package by.itstep.khodosevich.fourteenstage.levelE.module;

public class MaxAndMinIndex {

    private MaxAndMinIndex() {
    }

    public static int getMaxElementIndex(double[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static int getMinElementIndex(double[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }


    public static int getMaxAbsElementIndex(double[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        translateIntoPositiveArray(array);
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    private static void translateIntoPositiveArray(double[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] > 0 ? array[i] : -array[i];
        }
    }
}
