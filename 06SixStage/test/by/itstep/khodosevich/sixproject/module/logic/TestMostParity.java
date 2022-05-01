package by.itstep.khodosevich.sixproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.sixproject.module.logic.MostParity.*;

public class TestMostParity {

    @Test
    public void testCheckMostParityNumberPositive(){
        int actual_var1 = 2;
        int actual_var2 = 4;
        int actual_var3 = 6;
        boolean actual;
        boolean expected = true;

        actual = checkMostParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckMostParityNumberMostPositive(){
        int actual_var1 = 2;
        int actual_var2 = 1;
        int actual_var3 = 6;
        boolean actual;
        boolean expected = true;

        actual = checkMostParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckMostParityNumberNegative(){
        int actual_var1 = 1;
        int actual_var2 = 5;
        int actual_var3 = 3;
        boolean actual;
        boolean expected = false;

        actual = checkMostParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckMostParityNumberMostNegative(){
        int actual_var1 = 1;
        int actual_var2 = 3;
        int actual_var3 = 4;
        boolean actual;
        boolean expected = false;

        actual = checkMostParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckMostParityNumberWithZero(){
        int actual_var1 = 0;
        int actual_var2 = 0;
        int actual_var3 = 0;
        boolean actual;
        boolean expected = true;

        actual = checkMostParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

}
