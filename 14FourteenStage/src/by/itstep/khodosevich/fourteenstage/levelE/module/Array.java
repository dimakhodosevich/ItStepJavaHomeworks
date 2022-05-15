package by.itstep.khodosevich.fourteenstage.levelE.module;

import java.util.Random;

public class Array {

    private static final int MIN;
    private static final int MAX;

    static {
        MIN = -5;
        MAX = 5;
    }

    private Array() {
    }

    public static double[] initArray(int size) {
        if (size < 0) {
            throw new IllegalArgumentException();
        }
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(MAX - MIN + 1) + MIN;
        }
        return array;
    }

}
