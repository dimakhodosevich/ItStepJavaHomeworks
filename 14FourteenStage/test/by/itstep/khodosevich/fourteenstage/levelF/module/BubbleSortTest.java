package by.itstep.khodosevich.fourteenstage.levelF.module;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourteenstage.levelF.module.BubbleSort.*;

public class BubbleSortTest {

    // test - ascend
    @Test
    public void testBubbleSortAscPositiveWithOneElement(){
        int[] actual = {7};
        int[] expected = {7};
        bubbleSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortAscNegativeWithZeroLength(){
        boolean result = bubbleSortAsc(new int[0]);
        assertFalse("Your method works bad!!!", result);
    }

    @Test
    public void testBubbleSortAscNegativeWithNull(){
        boolean result = bubbleSortAsc(null);
        assertFalse("Your method works bad!!!", result);

    }

    @Test
    public void testBubbleSortAscPositiveWithFewElement(){
        int[] actual = {7,6,2,0,2};
        int[] expected = {0,2,2,6,7};
        bubbleSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortAscPositiveWithFewSameElement(){
        int[] actual = {7,7,7,7,7};
        int[] expected = {7,7,7,7,7};
        bubbleSortAsc(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortAscPositiveWithRange(){
        //                *   *
        int[] actual = {7,6,2,0,2};
        int[] expected = {7,0,2,6,2};
        bubbleSortAsc(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortAscPositiveWithRangeFullArray(){
        int[] actual = {7,6,2,0,2};
        int[] expected = {0,2,2,6,7};
        bubbleSortAsc(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortAscNegativeWithErrorStart(){
        int[] actual = {7,6,2,0,2};
        boolean expected = bubbleSortAsc(actual, -1, 3);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testBubbleSortAscNegativeWithErrorEnd(){
        int[] actual = {7,6,2,0,2};
        boolean expected = bubbleSortAsc(actual, 0, 6);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testBubbleSortAscNegativeWithErrorStartEnd(){
        int[] actual = {7,6,2,0,2};
        boolean expected = bubbleSortAsc(actual, 6, 0);
        assertFalse("Your method works bad!!!", expected);
    }


    // test - descend
    @Test
    public void testBubbleSortDesPositiveWithOneElement(){
        int[] actual = {7};
        int[] expected = {7};
        bubbleSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortDesNegativeWithZeroLength(){
        boolean result = bubbleSortDes(new int[0]);
        assertFalse("Your method works bad!!!", result);
    }

    @Test
    public void testBubbleSortDesNegativeWithNull(){
        boolean result = bubbleSortDes(null);
        assertFalse("Your method works bad!!!", result);

    }

    @Test
    public void testBubbleSortDesPositiveWithFewElement(){
        int[] actual = {7,6,2,0,2};
        int[] expected = {7,6,2,2,0};
        bubbleSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortDesPositiveWithFewSameElement(){
        int[] actual = {7,7,7,7,7};
        int[] expected = {7,7,7,7,7};
        bubbleSortDes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortDesPositiveWithRange(){
        //                *   *
        int[] actual = {7,6,2,0,2};
        int[] expected = {7,6,2,0,2};
        bubbleSortDes(actual, 1, 3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortDesPositiveWithRangeFullArray(){
        int[] actual = {7,6,2,0,2};
        int[] expected = {7,6,2,2,0};
        bubbleSortDes(actual, 0, actual.length-1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSortDesNegativeWithErrorStart(){
        int[] actual = {7,6,2,0,2};
        boolean expected = bubbleSortDes(actual, -1, 3);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testBubbleSortDesNegativeWithErrorEnd(){
        int[] actual = {7,6,2,0,2};
        boolean expected = bubbleSortDes(actual, 0, 6);
        assertFalse("Your method works bad!!!", expected);
    }

    @Test
    public void testBubbleSortDesNegativeWithErrorStartEnd(){
        int[] actual = {7,6,2,0,2};
        boolean expected = bubbleSortDes(actual, 6, 0);
        assertFalse("Your method works bad!!!", expected);
    }

}
