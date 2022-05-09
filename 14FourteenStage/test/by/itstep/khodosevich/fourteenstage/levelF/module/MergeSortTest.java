package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.MergeSort.*;

public class MergeSortTest {
    // test - ascend
    @Test
    public void testMergeSortAscPositiveWithOneElement() {
        int[] actual = {7};
        int[] expected = {7};
        mergeSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortAscNegativeWithZeroLength() {
        mergeSortAsc(new int[0]);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortAscNegativeWithNull() {
        mergeSortAsc(null);
    }

    @Test
    public void testMergeSortAscPositiveWithFewElement() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {0, 2, 2, 6, 7};
        mergeSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortAscPositiveWithFewSameElement() {
        int[] actual = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        mergeSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortAscPositiveWithRange() {
        //                 *     *
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 0, 2, 6, 2};
        mergeSortAsc(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortAscPositiveWithRangeFullArray() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {0, 2, 2, 6, 7};
        mergeSortAsc(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortAscNegativeWithErrorStart() {
        int[] actual = {7, 6, 2, 0, 2};
        mergeSortAsc(actual, -1, 3);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortAscNegativeWithErrorEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        mergeSortAsc(actual, 0, 6);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortAscNegativeWithErrorStartEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        mergeSortAsc(actual, 6, 0);
    }

    // test - descend
    @Test
    public void testMergeSortDesPositiveWithOneElement() {
        int[] actual = {7};
        int[] expected = {7};
        mergeSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortDesNegativeWithZeroLength() {
        mergeSortDes(new int[0]);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortDesNegativeWithNull() {
        mergeSortDes(null);
    }

    @Test
    public void testMergeSortDesPositiveWithFewElement() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 2, 0};
        mergeSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortDesPositiveWithFewSameElement() {
        int[] actual = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        mergeSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortDesPositiveWithRange() {
        //                *   *
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 0, 2};
        mergeSortDes(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSortDesPositiveWithRangeFullArray() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 2, 0};
        mergeSortDes(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortDesNegativeWithErrorStart() {
        int[] actual = {7, 6, 2, 0, 2};
        mergeSortDes(actual, -1, 3);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortDesNegativeWithErrorEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        mergeSortDes(actual, 0, 6);
    }

    @Test (expected = RuntimeException.class)
    public void testMergeSortDesNegativeWithErrorStartEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        mergeSortDes(actual, 6, 0);
    }
}
