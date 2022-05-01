package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.Parity.*;

public class TestParity {

    @Test
    public void testCheckParityPositive(){
        int actual_a = 2;
        int actual_b = 4;
        int actual_c = 6;
        boolean actual;
        boolean expected = true;

        actual = checkParity(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckParityNegative(){
        int actual_a = 1;
        int actual_b = 3;
        int actual_c = 5;
        boolean actual;
        boolean expected = false;

        actual = checkParity(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckParityBorder(){
        int actual_a = 2;
        int actual_b = 1;
        int actual_c = 6;
        boolean actual;
        boolean expected = false;

        actual = checkParity(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckParityAllZero(){
        int actual_a = 0;
        int actual_b = 0;
        int actual_c = 0;
        boolean actual;
        boolean expected = true;

        actual = checkParity(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckParityWithZeroLength(){
        boolean actual;

        actual = checkParity(new int[0]);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckParityWithNull(){
        boolean actual;

        actual = checkParity(null);
    }

}
