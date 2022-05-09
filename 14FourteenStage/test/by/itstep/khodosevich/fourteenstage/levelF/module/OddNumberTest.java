package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.OddNumber.*;

public class OddNumberTest {

    // test - first element
    @Test
    public void testFindFirstOddElementIndexPositiveWithOneParityElement(){
        int[] actualArray = {8};
        int expected = -1;
        int actual = findFirstOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstOddElementIndexPositiveWithZeroElement(){
        int[] actualArray = {0};
        int expected = -1;
        int actual = findFirstOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstOddElementIndexPositiveWithOneOddElement(){
        int[] actualArray = {7};
        int expected = 0;
        int actual = findFirstOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstOddElementIndexPositiveWithFewElement(){
        int[] actualArray = {8,8,7,-1,13,0};
        int expected = 2;
        int actual = findFirstOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstOddElementIndexPositiveWithFewElementWithoutOdd(){
        int[] actualArray = {8,8,4,2,0};
        int expected = -1;
        int actual = findFirstOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstOddElementIndexNegativeWithZeroLength(){
        int expected = -1;
        int actual = findFirstOddElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirstOddElementIndexNegativeWithNull(){
        int expected = -1;
        int actual = findFirstOddElementIndex(null);
        assertEquals(expected, actual);
    }

    // test - second element
    @Test
    public void testFindLastOddElementIndexPositiveWithOneParityElement(){
        int[] actualArray = {8};
        int expected = -1;
        int actual = findLastOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastOddElementIndexPositiveWithZeroElement(){
        int[] actualArray = {0};
        int expected = -1;
        int actual = findLastOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastOddElementIndexPositiveWithOneOddElement(){
        int[] actualArray = {7};
        int expected = 0;
        int actual = findLastOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastOddElementIndexPositiveWithFewElement(){
        int[] actualArray = {8,8,7,-1,13,0};
        int expected = 4;
        int actual = findLastOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastOddElementIndexPositiveWithFewElementWithoutOdd(){
        int[] actualArray = {8,8,4,2,0};
        int expected = -1;
        int actual = findLastOddElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindLastOddElementIndexNegativeWithZeroLength(){
        int expected = -1;
        int actual = findLastOddElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindlastOddElementIndexNegativeWithNull(){
        int expected = -1;
        int actual = findLastOddElementIndex(null);
        assertEquals(expected, actual);
    }
}
