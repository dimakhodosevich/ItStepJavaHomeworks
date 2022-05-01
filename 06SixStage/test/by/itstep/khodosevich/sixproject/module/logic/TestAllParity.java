package by.itstep.khodosevich.sixproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.sixproject.module.logic.AllParity.*;

public class TestAllParity {

    @Test
    public void testCheckAllParityPositive(){
        int actual_var1 = 4;
        int actual_var2 = 6;
        int actual_var3 = 2;
        boolean actual;
        boolean expected = true;

        actual = checkAllParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAllParityMostParity(){
        int actual_var1 = 2;
        int actual_var2 = 1;
        int actual_var3 = 4;
        boolean actual;
        boolean expected = false;

        actual = checkAllParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAllParityNegative(){
        int actual_var1 = 1;
        int actual_var2 = 5;
        int actual_var3 = 3;
        boolean actual;
        boolean expected = false;

        actual = checkAllParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAllParityMostNotParity(){
        int actual_var1 = 1;
        int actual_var2 = 2;
        int actual_var3 = 1;
        boolean actual;
        boolean expected = false;

        actual = checkAllParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAllParityWithZero(){
        int actual_var1 = 0;
        int actual_var2 = 0;
        int actual_var3 = 0;
        boolean actual;
        boolean expected = true;

        actual = checkAllParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

}
