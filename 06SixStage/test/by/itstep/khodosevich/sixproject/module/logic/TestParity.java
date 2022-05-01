package by.itstep.khodosevich.sixproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.sixproject.module.logic.Parity.*;

public class TestParity {

    @Test
    public void testCheckParityNumberPositive(){
        int actual_var = 2;
        boolean actual;
        boolean expected = true;

        actual= checkParityNumber(actual_var);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckParityNumberNegative(){
        int actual_var = 3;
        boolean actual;
        boolean expected = false;

        actual= checkParityNumber(actual_var);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckParityNumberWithZero(){
        int actual_var = 0;
        boolean actual;
        boolean expected = true;

        actual= checkParityNumber(actual_var);
        assertEquals(expected, actual);
    }


}
