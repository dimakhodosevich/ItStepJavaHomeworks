package by.itstep.khodosevich.fourteenstage.levelF.module;

public class UserNumber {
    private UserNumber() {
    }

    public static int findFirstUserNumberIndex(int[] array, int element) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int firstZeroIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                firstZeroIndex = i;
                return firstZeroIndex;
            }
        }

        return firstZeroIndex;
    }

    public static int findLastUserNumberIndex(int[] array, int element) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int lastZeroIndex = -1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element) {
                lastZeroIndex = i;
                return lastZeroIndex;
            }
        }

        return lastZeroIndex;
    }
}
