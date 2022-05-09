package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.ParityNumber.*;

public class ParityNumberTest {

    // test - first element
    @Test
    public void testFindFirstParityElementIndexPositiveWithOneOddElement(){
        int[] actualArray = {1};
        int expected = -1;
        int actual = findFirstParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstParityElementIndexPositiveWithOneZeroElement(){
        int[] actualArray = {0};
        int expected = 0;
        int actual = findFirstParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstParityElementIndexPositiveWithOneParityElement(){
        int[] actualArray = {2};
        int expected = 0;
        int actual = findFirstParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstParityElementIndexPositiveWithFewElement(){
        int[] actualArray = {1,2,3,4,5,6,7};
        int expected = 1;
        int actual = findFirstParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstParityElementIndexPositiveWithFewElementWithoutParity(){
        int[] actualArray = {1,3,5,7,9};
        int expected = -1;
        int actual = findFirstParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstParityElementIndexNegativeWithZeroLength(){
        int expected = -1;
        int actual = findFirstParityElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstParityElementIndexNegativeWithNull(){
        int expected = -1;
        int actual = findFirstParityElementIndex(null);
        assertEquals(expected, actual);
    }

    // test - last element
    @Test
    public void testFindLastParityElementIndexPositiveWithOneOddElement(){
        int[] actualArray = {1};
        int expected = -1;
        int actual = findLastParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastParityElementIndexPositiveWithOneZeroElement(){
        int[] actualArray = {0};
        int expected = 0;
        int actual = findLastParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastParityElementIndexPositiveWithOneParityElement(){
        int[] actualArray = {2};
        int expected = 0;
        int actual = findLastParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastParityElementIndexPositiveWithFewElement(){
        int[] actualArray = {1,2,3,4,5,6,7};
        int expected = 5;
        int actual = findLastParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastParityElementIndexPositiveWithFewElementWithoutParity(){
        int[] actualArray = {1,3,5,7,9};
        int expected = -1;
        int actual = findLastParityElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastParityElementIndexNegativeWithZeroLength(){
        int expected = -1;
        int actual = findLastParityElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastParityElementIndexNegativeWithNull(){
        int expected = -1;
        int actual = findLastParityElementIndex(null);
        assertEquals(expected, actual);
    }
}
