package by.itstep.khodosevich.fourteenstage.levelE.module;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelE.module.Multiple.*;

public class MultipleTest {
    private static double[] array;
    private static double delta;

    static {
        //                            *           *
        array = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        delta = 0.001;
    }


    @Test
    public void multipleTestPositiveAllElement() {
        double expected = 0;
        double actual = multiple(array, 0, array.length);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void multipleTestPositiveFirstElement() {
        double expected = 1;
        double actual = multiple(array, 0, 1);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void multipleTestPositiveLastElement() {
        double expected = 0;
        double actual = multiple(array, array.length - 1, array.length);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void multipleTestPositiveRangeElement() {
        double expected = 840;
        double actual = multiple(array, 3, 7);
        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void multipleTestNegativeWithNull() {
        multiple(null, 0, array.length);
    }

    @Test(expected = RuntimeException.class)
    public void multipleTestNegativeWithZeroLength() {
        multiple(new double[0], 0, array.length);
    }

    @Test(expected = RuntimeException.class)
    public void multipleTestNegativeErrorWithFirstIndex() {
        multiple(array, -1, array.length);
    }

    @Test(expected = RuntimeException.class)
    public void multipleTestNegativeErrorWithSecondIndex() {
        multiple(array, 0, array.length + 1);
    }

}
