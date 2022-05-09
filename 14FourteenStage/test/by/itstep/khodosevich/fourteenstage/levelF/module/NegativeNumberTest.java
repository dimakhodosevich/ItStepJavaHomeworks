package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.NegativeNumber.*;

public class NegativeNumberTest {

    // test - first element
    @Test
    public static void testFindFirstNegativeElementIndexPositiveWithOneNegativeElement(){
        int[] actualArray = {-7};
        int expected = 0;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindFirstNegativeElementIndexPositiveWithOnePositiveElement(){
        int[] actualArray = {7};
        int expected = -1;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindFirstNegativeElementIndexPositiveWithOneZeroElement(){
        int[] actualArray = {0};
        int expected = -1;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindFirstNegativeElementIndexPositiveWithFewElement(){
        int[] actualArray = {3,0,-7,11,5};
        int expected = 2;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindFirstNegativeElementIndexPositiveWithTwoNegativeElement(){
        int[] actualArray = {4,4,6,1,-7, 0,-7};
        int expected = 4;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindFirstNegativeElementIndexPositiveWithoutNegativeElement(){
        int[] actualArray = {4,4,6,1,0};
        int expected = -1;
        int actual = findFirstNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindFirstNegativeElementIndexNegativeWithZeroLength(){
        int expected = -1;
        int actual = findFirstNegativeElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindFirstNegativeElementIndexNegativeWithNull(){
        int expected = -1;
        int actual = findFirstNegativeElementIndex(null);
        assertEquals(expected, actual);
    }

    // test - last element
    @Test
    public static void testFindLastNegativeElementIndexPositiveWithOneNegativeElement(){
        int[] actualArray = {-7};
        int expected = 0;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindLastNegativeElementIndexPositiveWithOnePositiveElement(){
        int[] actualArray = {7};
        int expected = -1;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindLastNegativeElementIndexPositiveWithOneZeroElement(){
        int[] actualArray = {0};
        int expected = -1;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindLastNegativeElementIndexPositiveWithFewElement(){
        int[] actualArray = {3,0,-7,11,5};
        int expected = 2;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindLastNegativeElementIndexPositiveWithTwoNegativeElement(){
        int[] actualArray = {4,4,6,1,-7, 0,-7};
        int expected = 4;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindlastNegativeElementIndexPositiveWithoutNegativeElement(){
        int[] actualArray = {4,4,6,1,0};
        int expected = -1;
        int actual = findLastNegativeElementIndex(actualArray);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindLastNegativeElementIndexNegativeWithZeroLength(){
        int expected = -1;
        int actual = findLastNegativeElementIndex(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public static void testFindLastNegativeElementIndexNegativeWithNull(){
        int expected = -1;
        int actual = findLastNegativeElementIndex(null);
        assertEquals(expected, actual);
    }
}
