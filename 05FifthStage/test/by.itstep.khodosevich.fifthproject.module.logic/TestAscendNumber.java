package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.AscendNumber.*;

public class TestAscendNumber {

    @Test
    public void testCheckAscendNumberPositive(){
        long actual_var = 1234l;
        boolean actual;
        boolean expected = true;

        actual = checkAscendNumber(actual_var);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAscendNumberNegative(){
        long actual_var = 4321l;
        boolean actual;
        boolean expected = false;

        actual = checkAscendNumber(actual_var);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAscendNumberBorder(){
        long actual_var = 1204l;
        boolean actual;
        boolean expected = false;

        actual = checkAscendNumber(actual_var);
        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckAscendNumberZero(){
        long actual_var = 0l;
        boolean actual;

        actual = checkAscendNumber(actual_var);
    }

    @Test (expected = RuntimeException.class)
    public void testCheckAscendNumberOneNumber(){
        long actual_var = 7l;
        boolean actual;

        actual = checkAscendNumber(actual_var);
    }
}
