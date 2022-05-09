package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.InsertSort.*;

public class InsertSortTest {

    // test - ascend
    @Test
    public void testInsertSortAscPositiveWithOneElement() {
        int[] actual = {7};
        int[] expected = {7};
        insertSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortAscNegativeWithZeroLength() {
        boolean result = insertSortAsc(new int[0]);
        assertFalse("Your method works bad!!!", result);
    }

    @Test
    public void testInsertSortAscNegativeWithNull() {
        boolean result = insertSortAsc(null);
        assertFalse("Your method works bad!!!", result);

    }

    @Test
    public void testInsertSortAscPositiveWithFewElement() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {0, 2, 2, 6, 7};
        insertSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testinsertSortAscPositiveWithFewSameElement() {
        int[] actual = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        insertSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortAscPositiveWithRange() {
        //                 *     *
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 0, 2, 6, 2};
        insertSortAsc(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortAscPositiveWithRangeFullArray() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {0, 2, 2, 6, 7};
        insertSortAsc(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortAscNegativeWithErrorStart() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = insertSortAsc(actual, -1, 3);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testInsertSortAscNegativeWithErrorEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = insertSortDes(actual, 0, 6);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testInsertSortAscNegativeWithErrorStartEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = insertSortAsc(actual, 6, 0);
        assertFalse("Your method works bad!!!", expected);
    }

    // test - descend
    @Test
    public void testInsertSortDesPositiveWithOneElement() {
        int[] actual = {7};
        int[] expected = {7};
        insertSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortDesNegativeWithZeroLength() {
        boolean result = insertSortDes(new int[0]);
        assertFalse("Your method works bad!!!", result);
    }

    @Test
    public void testInsertSortDesNegativeWithNull() {
        boolean result = insertSortDes(null);
        assertFalse("Your method works bad!!!", result);

    }

    @Test
    public void testInsertSortDesPositiveWithFewElement() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 2, 0};
        insertSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortDesPositiveWithFewSameElement() {
        int[] actual = {7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7};
        insertSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortDesPositiveWithRange() {
        //                *   *
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 0, 2};
        insertSortDes(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortDesPositiveWithRangeFullArray() {
        int[] actual = {7, 6, 2, 0, 2};
        int[] expected = {7, 6, 2, 2, 0};
        insertSortDes(actual, 0, actual.length - 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertSortDesNegativeWithErrorStart() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = insertSortDes(actual, -1, 3);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testInsertSortDesNegativeWithErrorEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = insertSortDes(actual, 0, 6);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testInsertSortDesNegativeWithErrorStartEnd() {
        int[] actual = {7, 6, 2, 0, 2};
        boolean expected = insertSortDes(actual, 6, 0);
        assertFalse("Your method works bad!!!", expected);
    }
}
