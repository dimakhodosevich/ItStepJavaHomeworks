package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.QuickSort.*;

public class QuickSortTest {
    // test - ascend
    @Test
    public void testQuickSortAscPositiveWithOneElement() {
        int[] actual = {7};
        int[] expected = {7};
        quickSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testQuickSortAscNegativeWithZeroLength() {
        quickSortAsc(new int[0]);
    }

    @Test(expected = RuntimeException.class)
    public void testQuickSortAscNegativeWithNull() {
        quickSortAsc(null);
    }

    @Test
    public void testQuickSortAscPositiveWithFewElement() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {0, 2, 2, 6, 7};
        quickSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortAscPositiveWithFewSameElement() {
        int[] actual = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        quickSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortAscPositiveWithRange() {
        //                *   *
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 0, 2, 6, 2};
        quickSortAsc(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortAscPositiveWithRangeFullArray() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {0, 2, 2, 6, 7};
        quickSortAsc(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testQuickSortAscNegativeWithErrorStart() {
        int[] actual = {7, 6, 2, 0, 2};
        quickSortAsc(actual, -1, 3);
    }

    @Test(expected = RuntimeException.class)
    public void testQuickSortAscNegativeWithErrorEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        quickSortAsc(actual, 0, 6);
    }

    @Test(expected = RuntimeException.class)
    public void testQuickSortAscNegativeWithErrorStartEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        quickSortAsc(actual, 6, 0);
    }


    // test - descend
    @Test
    public void testQuickSortDesPositiveWithOneElement() {
        int[] actual = {7};
        int[] expected = {7};
        quickSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testQuickSortDesNegativeWithZeroLength() {
        quickSortDes(new int[0]);
    }

    @Test(expected = RuntimeException.class)
    public void testQuickSortDesNegativeWithNull() {
        quickSortDes(null);
    }

    @Test
    public void testQuickSortDesPositiveWithFewElement() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 2, 0};
        quickSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortDesPositiveWithFewSameElement() {
        int[] actual = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        quickSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortDesPositiveWithRange() {
        //                *   *
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 0, 2};
        quickSortDes(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSortDesPositiveWithRangeFullArray() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 2, 0};
        quickSortDes(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testQuickSortDesNegativeWithErrorStart() {
        int[] actual = {7, 6, 2, 0, 2};
        quickSortDes(actual, -1, 3);
    }

    @Test(expected = RuntimeException.class)
    public void testQuickSortDesNegativeWithErrorEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        quickSortDes(actual, 0, 6);
    }

    @Test(expected = RuntimeException.class)
    public void testBubbleSortDesNegativeWithErrorStartEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        quickSortDes(actual, 6, 0);
    }

}
