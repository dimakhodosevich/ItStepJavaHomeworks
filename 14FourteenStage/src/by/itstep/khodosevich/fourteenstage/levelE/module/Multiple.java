package by.itstep.khodosevich.fourteenstage.levelE.module;

public class Multiple {
    private Multiple() {
    }

    public static double multiple(double[] array, int start, int end) {
        if (array == null || array.length == 0 || start < 0 || end > array.length) {
            throw new RuntimeException();
        }

        double sum = 1;
        for (int i = start; i < end; i++) {
            sum *= array[i];
        }

        return sum;
    }

    public static double multipleInt(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start < 0 || end > array.length) {
            throw new RuntimeException();
        }

        double sum = 1;
        for (int i = start; i < end; i++) {
            sum *= array[i];
        }

        return sum;
    }

}
