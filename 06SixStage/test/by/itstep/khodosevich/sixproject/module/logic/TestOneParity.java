package by.itstep.khodosevich.sixproject.module.logic;

import org.junit.Test;
import static by.itstep.khodosevich.sixproject.module.logic.OneParity.*;
import static org.junit.Assert.assertEquals;

public class TestOneParity {
    @Test
    public void testCheckOneParityPositive(){
        int actual_var1 = 1;
        int actual_var2 = 1;
        int actual_var3 = 2;
        boolean actual;
        boolean expected = true;

        actual = checkOneParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckOneParityNegative(){
        int actual_var1 = 1;
        int actual_var2 = 1;
        int actual_var3 = 1;
        boolean actual;
        boolean expected = false;

        actual = checkOneParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckAllParityWithZero(){
        int actual_var1 = 0;
        int actual_var2 = 0;
        int actual_var3 = 0;
        boolean actual;
        boolean expected = false;

        actual = checkOneParityNumber(actual_var1, actual_var2, actual_var3);
        assertEquals(expected, actual);
    }
}
