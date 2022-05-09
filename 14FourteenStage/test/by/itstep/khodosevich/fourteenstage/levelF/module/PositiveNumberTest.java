package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.PositiveNumber.*;

public class PositiveNumberTest {
    // test - first element

    @Test
    public void testFindFirstPositiveElementIndexPositiveWithOneZeroElement() {
        int[] actualArray = {0};
        int expected = -1;
        int actual = findFirstPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstPositiveElementIndexPositiveWithOnePositiveElement() {
        int[] actualArray = {7};
        int expected = 0;
        int actual = findFirstPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstPositiveElementIndexPositiveWithFewElement() {
        int[] actualArray = {0, 4, 2, 33, -1};
        int expected = 1;
        int actual = findFirstPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstPositiveElementIndexPositiveWithFewNegativeAndZeroElement() {
        int[] actualArray = {-5, -3, -1, 0};
        int expected = -1;
        int actual = findFirstPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstPositiveElementIndexPositiveWithTwoPositiveElement() {
        int[] actualArray = {7, 7};
        int expected = 0;
        int actual = findFirstPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstPositiveElementIndexNegativeWithZeroLength() {
        int expected = -1;
        int actual = findFirstPositiveElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstPositiveElementIndexNegativeWithNull() {
        int expected = -1;
        int actual = findFirstPositiveElementIndex(null);
        assertEquals(expected, actual);
    }

    // test - last element

    @Test
    public void testFindLastPositiveElementIndexPositiveWithOneZeroElement() {
        int[] actualArray = {0};
        int expected = -1;
        int actual = findLastPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastPositiveElementIndexPositiveWithOnePositiveElement() {
        int[] actualArray = {7};
        int expected = 0;
        int actual = findLastPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastPositiveElementIndexPositiveWithFewElement() {
        int[] actualArray = {0, 4, 2, 33, -1};
        int expected = 3;
        int actual = findLastPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastPositiveElementIndexPositiveWithFewNegativeAndZeroElement() {
        int[] actualArray = {-5, -3, -1, 0};
        int expected = -1;
        int actual = findLastPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastPositiveElementIndexPositiveWithTwoPositiveElement() {
        int[] actualArray = {7, 7};
        int expected = 1;
        int actual = findLastPositiveElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastPositiveElementIndexNegativeWithZeroLength() {
        int expected = -1;
        int actual = findLastPositiveElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastPositiveElementIndexNegativeWithNull() {
        int expected = -1;
        int actual = findLastPositiveElementIndex(null);
        assertEquals(expected, actual);
    }
}
