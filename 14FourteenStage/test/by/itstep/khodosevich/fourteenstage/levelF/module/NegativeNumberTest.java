package by.itstep.khodosevich.fourteenstage.levelF.module;

import by.itstep.khodosevich.fourteenstage.levelE.module.MaxAndMinIndex;
import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.NegativeNumber.*;

public class NegativeNumberTest {

    // test - first element
    @Test
    public void testFindFirstNegativeElementIndexPositiveWithOneNegativeElement() {
        int[] actualArray = {-7};
        int expected = 0;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstNegativeElementIndexPositiveWithOnePositiveElement() {
        int[] actualArray = {7};
        int expected = -1;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstNegativeElementIndexPositiveWithOneZeroElement() {
        int[] actualArray = {0};
        int expected = -1;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstNegativeElementIndexPositiveWithFewElement() {
        int[] actualArray = {3, 0, -7, 11, 5};
        int expected = 2;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstNegativeElementIndexPositiveWithTwoNegativeElement() {
        int[] actualArray = {4, 4, 6, 1, -7, 0, -7};
        int expected = 4;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstNegativeElementIndexPositiveWithoutNegativeElement() {
        int[] actualArray = {4, 4, 6, 1, 0};
        int expected = -1;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstNegativeElementIndexNegativeWithZeroLength() {
        int expected = -1;
        int actual = findFirstNegativeElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstNegativeElementIndexNegativeWithNull() {
        int expected = -1;
        int actual = findFirstNegativeElementIndex(null);
        assertEquals(expected, actual);
    }

    // test - last element
    @Test
    public void testFindLastNegativeElementIndexPositiveWithOneNegativeElement() {
        int[] actualArray = {-7};
        int expected = 0;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastNegativeElementIndexPositiveWithOnePositiveElement() {
        int[] actualArray = {7};
        int expected = -1;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastNegativeElementIndexPositiveWithOneZeroElement() {
        int[] actualArray = {0};
        int expected = -1;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastNegativeElementIndexPositiveWithFewElement() {
        int[] actualArray = {3, 0, -7, 11, 5};
        int expected = 2;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastNegativeElementIndexPositiveWithTwoNegativeElement() {
        int[] actualArray = {4, 4, 6, 1, -7, 0, -7};
        int expected = 6;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindlastNegativeElementIndexPositiveWithoutNegativeElement() {
        int[] actualArray = {4, 4, 6, 1, 0};
        int expected = -1;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastNegativeElementIndexNegativeWithZeroLength() {
        int expected = -1;
        int actual = findLastNegativeElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastNegativeElementIndexNegativeWithNull() {
        int expected = -1;
        int actual = findLastNegativeElementIndex(null);
        assertEquals(expected, actual);
    }

    // third - second min element index

    @Test
    public void findSecondNegativeElementIndexPositiveWithAllDifferentElement() {
        int[] array = new int[]{-1, 2, -3, 4, -5, 3, 3, 1, 1, 0};
        int expected = 2;
        int actual = NegativeNumber.findSecondNegativeElementIndex(array);
        assertEquals(expected, actual);
    }

    @Test
    public void findSecondNegativeElementIndexPositiveWithSameElement() {
        int[] array = new int[]{1, 1, 1, 1, 1, 1};
        int expected = -1;
        int actual = NegativeNumber.findSecondNegativeElementIndex(array);
        assertEquals(expected, actual);
    }

    @Test
    public void getSecondMinElementIndexNegativeWithNull() {
        int expected = -1;
        int actual = NegativeNumber.findSecondNegativeElementIndex(null);
        assertEquals(expected, actual);
    }

    @Test
    public void getSecondMinElementIndexNegativeWithZeroLength() {
        int expected = -1;
        int actual = NegativeNumber.findSecondNegativeElementIndex(new int[0]);
        assertEquals(expected, actual);
    }


}
