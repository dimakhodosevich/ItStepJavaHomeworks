package by.itstep.khodosevich.fourteenstage.levelE.module;

public class Sum {
    private Sum() {
    }

    public static double sum(double[] array, int start, int end) {
        if (array == null || array.length == 0 || start < 0 || end > array.length) {
            throw new RuntimeException();
        }

        double sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }

        return sum;
    }
}
