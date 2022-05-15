package by.itstep.khodosevich.fourteenstage.levelE.module;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelE.module.MaxAndMinIndex.*;

public class MaxAndMinIndexTest {

    // first - max index
    @Test
    public void getMaxElementIndexPositiveWithDifferentElement() {
        double[] array = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int expected = 8;
        int actual = getMaxElementIndex(array);
        assertEquals(expected, actual);
    }

    @Test
    public void getMaxElementIndexPositiveWithSameElement() {
        double[] array = new double[]{1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        int actual = getMaxElementIndex(array);
        assertEquals(expected, actual);
    }

    @Test
    public void getMaxElementIndexNegativeWithNull() {
        getMaxElementIndex(null);
    }

    @Test
    public void getMaxElementIndexNegativeWithZeroLength() {
        getMaxElementIndex(new double[0]);
    }

    // second - min index
    @Test
    public void getMinElementIndexPositiveWithDifferentElement() {
        double[] array = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int expected = 9;
        int actual = getMinElementIndex(array);
        assertEquals(expected, actual);
    }

    @Test
    public void getMinElementIndexPositiveWithSameElement() {
        double[] array = new double[]{1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        int actual = getMinElementIndex(array);
        assertEquals(expected, actual);
    }

    @Test
    public void getMinElementIndexNegativeWithNull() {
        getMinElementIndex(null);
    }

    @Test
    public void getMinElementIndexNegativeWithZeroLength() {
        getMinElementIndex(new double[0]);
    }

    // third - max module value index

    @Test
    public void getMaxAbsElementIndexPositiveWithAllDifferentElement() {
        double[] array = new double[]{-1, 2, -3, 4, -5, 3, 3, 1, 1, 0};
        int expected = 4;
        int actual = MaxAndMinIndex.getMaxAbsElementIndex(array);
        assertEquals(expected, actual);
    }

    @Test
    public void getMaxAbsElementIndexPositiveWithSameElement() {
        double[] array = new double[]{1, 1, 1, 1, 1, 1};
        int expected = 0;
        int actual = MaxAndMinIndex.getMaxAbsElementIndex(array);
        assertEquals(expected, actual);
    }

    @Test
    public void getMaxAbsElementIndexNegativeWithNull() {
        int expected = -1;
        int actual = MaxAndMinIndex.getMaxAbsElementIndex(null);
        assertEquals(expected, actual);
    }

    @Test
    public void getMaxAbsElementIndexNegativeWithZeroLength() {
        int expected = -1;
        int actual = MaxAndMinIndex.getMaxAbsElementIndex(new double[0]);
        assertEquals(expected, actual);
    }
}
