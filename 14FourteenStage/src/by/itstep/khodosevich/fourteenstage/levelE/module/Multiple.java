package by.itstep.khodosevich.fourteenstage.levelE.module;

public class Multiple {
    private Multiple() {
    }

    public static double multiple(double[] array, int start, int end) {
        if (array == null || array.length == 0 || start < 0 || end > array.length) {
            throw new RuntimeException();
        }

        double mult = 0;
        boolean flag = false;
        for (int i = start; i < end; i++) {
            if (!flag) {
                mult = 1;
                flag = true;
            }
            mult *= array[i];
        }

        return mult;
    }

    public static double multipleInt(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start < 0 || end > array.length) {
            throw new RuntimeException();
        }

        double mult = 0;
        boolean flag = false;

        for (int i = start; i < end; i++) {
            if (!flag) {
                mult = 1;
                flag = true;
            }
            mult *= array[i];
        }

        return mult;
    }

}
