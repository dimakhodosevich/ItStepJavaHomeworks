package by.itstep.khodosevich.fourteenstage.levelF.module;

public class PositiveNumber {
    private PositiveNumber() {
    }

    public static int findFirstPositiveElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int firstIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                firstIndex = i;
                return firstIndex;
            }
        }

        return firstIndex;
    }

    public static int findLastPositiveElementIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int lastIndex = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                lastIndex = i;
                return lastIndex;
            }
        }

        return lastIndex;
    }


}
