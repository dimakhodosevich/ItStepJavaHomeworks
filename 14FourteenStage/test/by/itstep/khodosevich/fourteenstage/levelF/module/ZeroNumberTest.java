package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.ZeroNumber.*;

public class ZeroNumberTest {

    // test - first element
    @Test
    public void testFindFirstZeroElementPositiveWithOneRandomElement() {
        int[] actualArray = {7};
        int expected = -1;
        int actual = findFirstZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstZeroElementPositiveWithOneZeroElement() {
        int[] actualArray = {0};
        int expected = 0;
        int actual = findFirstZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstZeroElementPositiveWithFewElementsWithZero() {
        int[] actualArray = {7, 5, 0, 3, 4, 5};
        int expected = 2;
        int actual = findFirstZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstZeroElementPositiveWithFewElementsWithoutZero() {
        int[] actualArray = {7, 5, 5, 3, 4, 5};
        int expected = -1;
        int actual = findFirstZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstZeroElementPositiveWithTwoZeroElements() {
        int[] actualArray = {0, 0};
        int expected = 0;
        int actual = findFirstZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstZeroElementNegativeWithZeroSize() {
        int expected = -1;
        int actual = findFirstZeroElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstZeroElementNegativeWithNull() {
        int expected = -1;
        int actual = findFirstZeroElementIndex(null);
        assertEquals(expected, actual);
    }

    // test - last element
    @Test
    public void testFindLastZeroElementPositiveWithOneRandomElement() {
        int[] actualArray = {7};
        int expected = -1;
        int actual = findLastZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastZeroElementPositiveWithOneZeroElement() {
        int[] actualArray = {0};
        int expected = 0;
        int actual = findLastZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastZeroElementPositiveWithFewElementsWithZero() {
        int[] actualArray = {7, 5, 0, 3, 4, 5};
        int expected = 2;
        int actual = findLastZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastZeroElementPositiveWithFewElementsWithoutZero() {
        int[] actualArray = {7, 5, 5, 3, 4, 5};
        int expected = -1;
        int actual = findLastZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastZeroElementPositiveWithTwoZeroElements() {
        int[] actualArray = {0, 0};
        int expected = 1;
        int actual = findLastZeroElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastZeroElementNegativeWithZeroSize() {
        int expected = -1;
        int actual = findLastZeroElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastZeroElementNegativeWithNull() {
        int expected = -1;
        int actual = findLastZeroElementIndex(null);
        assertEquals(expected, actual);
    }

}
