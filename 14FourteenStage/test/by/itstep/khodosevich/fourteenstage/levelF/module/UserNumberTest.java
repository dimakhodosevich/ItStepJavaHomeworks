package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.UserNumber.*;

public class UserNumberTest {

    // test - first element
    @Test
    public void testFindFirstUserNumberIndexPositiveWithOneNumber() {
        int[] actualArray = {7};
        int expected = -1;
        int actual = findFirstUserNumberIndex(actualArray, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstUserNumberIndexPositiveWithOneUserNumber() {
        int[] actualArray = {7};
        int expected = 0;
        int actual = findFirstUserNumberIndex(actualArray, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstUserNumberIndexPositiveWithFewNumberWithoutUserNumber() {
        int[] actualArray = {7, 8, 3, 1, -1};
        int expected = -1;
        int actual = findFirstUserNumberIndex(actualArray, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstUserNumberIndexPositiveWithFewNumberWithUserNumber() {
        int[] actualArray = {7, 8, 7, 1, -1};
        int expected = 0;
        int actual = findFirstUserNumberIndex(actualArray, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstUserNumberIndexPositiveWithZeroLength() {
        int expected = -1;
        int actual = findFirstUserNumberIndex(new int[0], 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstUserNumberIndexPositiveWithNull() {
        int expected = -1;
        int actual = findFirstUserNumberIndex(null, 7);
        assertEquals(expected, actual);
    }

    // test - last element
    @Test
    public void testFindLastUserNumberIndexPositiveWithOneNumber() {
        int[] actualArray = {7};
        int expected = -1;
        int actual = findLastUserNumberIndex(actualArray, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastUserNumberIndexPositiveWithOneUserNumber() {
        int[] actualArray = {7};
        int expected = 0;
        int actual = findLastUserNumberIndex(actualArray, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastUserNumberIndexPositiveWithFewNumberWithoutUserNumber() {
        int[] actualArray = {7, 8, 3, 1, -1};
        int expected = -1;
        int actual = findLastUserNumberIndex(actualArray, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastUserNumberIndexPositiveWithFewNumberWithUserNumber() {
        int[] actualArray = {7, 8, 7, 1, -1};
        int expected = 2;
        int actual = findLastUserNumberIndex(actualArray, 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastUserNumberIndexPositiveWithZeroLength() {
        int expected = -1;
        int actual = findLastUserNumberIndex(new int[0], 7);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastUserNumberIndexPositiveWithNull() {
        int expected = -1;
        int actual = findLastUserNumberIndex(null, 7);
        assertEquals(expected, actual);
    }
}
