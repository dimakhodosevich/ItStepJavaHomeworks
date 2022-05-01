package by.itstep.khodosevich.fourproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourproject.module.logic.SquareInRectangle.*;

public class TestSquareInRectangle {

    @Test
    public void testCalculateSquareInLengthPositive(){
        double actual_lengthOfRectangle= 10;
        double actual_lengthOfSquare = 3;
        int actual;
        int expected = 3;

        actual = calculateSquareInLength(actual_lengthOfRectangle, actual_lengthOfSquare);
        assertEquals(expected, actual);
    }

    @Test (expected =  RuntimeException.class)
    public void testCalculateSquareInLengthNegative(){
        double actual_lengthOfRectangle= -10;
        double actual_lengthOfSquare = 3;

        int actual = calculateSquareInLength(actual_lengthOfRectangle, actual_lengthOfSquare);
    }

    @Test
    public void testCalculateSquareInWidthPositive(){
        double actual_lengthOfRectangle= 10;
        double actual_lengthOfSquare = 3;
        int actual;
        int expected = 3;

        actual = calculateSquareInLength(actual_lengthOfRectangle, actual_lengthOfSquare);
        assertEquals(expected, actual);
    }

    @Test (expected =  RuntimeException.class)
    public void testCalculateSquareInWidthNegative(){
        double actual_lengthOfRectangle= -10;
        double actual_lengthOfSquare = 3;

        int actual = calculateSquareInLength(actual_lengthOfRectangle, actual_lengthOfSquare);
    }



}
