package by.itstep.khodosevich.fourteenstage.levelF.module;

public class NegativeNumber {
    private NegativeNumber() {
    }

    public static int findFirstNegativeElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int firstIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstIndex = i;
                return firstIndex;
            }
        }

        return firstIndex;
    }

    public static int findLastNegativeElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int lastIndex = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 0) {
                lastIndex = i;
                return lastIndex;
            }
        }

        return lastIndex;
    }

    public static int findSecondNegativeElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int firstIndex = -1;
        int secondIndex = -1;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && !flag) {
                firstIndex = i;
                flag = true;
            }

            if (flag && array[i] < 0 && firstIndex != i) {
                secondIndex = i;
                return secondIndex;
            }
        }

        return secondIndex;
    }
}
