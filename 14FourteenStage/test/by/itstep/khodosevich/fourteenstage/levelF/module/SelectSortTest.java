package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.SelectSort.*;

public class SelectSortTest {

    // test - ascend
    @Test
    public void testSelectSortAscPositiveWithOneElement() {
        int[] actual = {7};
        int[] expected = {7};
        selectSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortAscNegativeWithZeroLength() {
        boolean result = SelectSort.selectSortAsc(new int[0]);
        assertFalse("Your method works bad!!!", result);
    }

    @Test
    public void testSelectSortAscNegativeWithNull() {
        boolean result = SelectSort.selectSortAsc(null);
        assertFalse("Your method works bad!!!", result);

    }

    @Test
    public void testSelectSortAscPositiveWithFewElement() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {0, 2, 2, 6, 7};
        SelectSort.selectSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortAscPositiveWithFewSameElement() {
        int[] actual = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        SelectSort.selectSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortAscPositiveWithRange() {
        //                *   *
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 0, 2, 6, 2};
        SelectSort.selectSortAsc(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortAscPositiveWithRangeFullArray() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {0, 2, 2, 6, 7};
        SelectSort.selectSortAsc(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortAscNegativeWithErrorStart() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = SelectSort.selectSortAsc(actual, -1, 3);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testSelectSortAscNegativeWithErrorEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = SelectSort.selectSortAsc(actual, 0, 6);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testSelectSortAscNegativeWithErrorStartEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = SelectSort.selectSortAsc(actual, 6, 0);
        assertFalse("Your method works bad!!!", expected);
    }

    // test - descend
    @Test
    public void testSelectSortDesPositiveWithOneElement() {
        int[] actual = {7};
        int[] expected = {7};
        selectSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortDesNegativeWithZeroLength() {
        boolean result = SelectSort.selectSortDes(new int[0]);
        assertFalse("Your method works bad!!!", result);
    }

    @Test
    public void testSelectSortDesNegativeWithNull() {
        boolean result = SelectSort.selectSortDes(null);
        assertFalse("Your method works bad!!!", result);

    }

    @Test
    public void testSelectSortDesPositiveWithFewElement() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {0, 2, 2, 6, 7};
        SelectSort.selectSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortDesPositiveWithFewSameElement() {
        int[] actual = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        SelectSort.selectSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortDesPositiveWithRange() {
        //                *   *
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 0, 2};
        SelectSort.selectSortDes(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortDesPositiveWithRangeFullArray() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 2, 0};
        SelectSort.selectSortDes(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSortDesNegativeWithErrorStart() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = SelectSort.selectSortDes(actual, -1, 3);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testSelectSortDesNegativeWithErrorEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = SelectSort.selectSortDes(actual, 0, 6);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testSelectSortDesNegativeWithErrorStartEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = SelectSort.selectSortDes(actual, 6, 0);
        assertFalse("Your method works bad!!!", expected);
    }

}
