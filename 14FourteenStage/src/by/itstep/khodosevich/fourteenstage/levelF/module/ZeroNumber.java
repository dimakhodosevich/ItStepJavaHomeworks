package by.itstep.khodosevich.fourteenstage.levelF.module;

public class ZeroNumber {
    private ZeroNumber() {
    }

    public static int findFirstZeroElement(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int firstZeroIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                firstZeroIndex = i;
                return firstZeroIndex;
            }
        }

        return firstZeroIndex;
    }

    public static int findLastZeroElement(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int lastZeroIndex = -1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                lastZeroIndex = i;
                return lastZeroIndex;
            }
        }

        return lastZeroIndex;
    }
}
