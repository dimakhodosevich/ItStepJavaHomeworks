package by.itstep.khodosevich.fourteenstage.levelE.module;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelE.module.Sum.*;

public class SumTest {
    private static double[] array;
    private static double delta;

    static {
        //                            *           *
        array = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        delta = 0.001;
    }

    @Test
    public void sumTestPositiveAllElement() {
        double expected = 45;
        double actual = sum(array, 0, array.length);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void sumTestPositiveFirstElement() {
        double expected = 1;
        double actual = sum(array, 0, 1);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void sumTestPositiveLastElement() {
        double expected = 0;
        double actual = sum(array, array.length - 1, array.length);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void sumTestPositiveRangeElement() {
        double expected = 22;
        double actual = sum(array, 3, 7);
        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void sumTestNegativeWithNull() {
        sum(null, 0, array.length);
    }

    @Test(expected = RuntimeException.class)
    public void sumTestNegativeWithZeroLength() {
        sum(new double[0], 0, array.length);
    }

    @Test(expected = RuntimeException.class)
    public void sumTestNegativeErrorWithFirstIndex() {
        sum(array, -1, array.length);
    }

    @Test(expected = RuntimeException.class)
    public void sumTestNegativeErrorWithSecondIndex() {
        sum(array, 0, array.length + 1);
    }

}
