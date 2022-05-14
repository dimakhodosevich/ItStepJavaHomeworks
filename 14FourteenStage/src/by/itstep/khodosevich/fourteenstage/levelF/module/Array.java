package by.itstep.khodosevich.fourteenstage.levelF.module;

import java.util.Random;

public class Array {
    private static final int MIN;
    private static final int MAX;

    static {
        MIN = -10;
        MAX = 10;
    }

    private Array() {
    }

    public static int[] initArray(int size) {
        if (size < 0) {
            throw new IllegalArgumentException();
        }
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }
        return array;
    }

}
