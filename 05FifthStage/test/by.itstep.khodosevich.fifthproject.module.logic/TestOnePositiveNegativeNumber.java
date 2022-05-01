package by.itstep.khodosevich.fifthproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fifthproject.module.logic.OnePositiveNegativeNumber.*;

public class TestOnePositiveNegativeNumber {

    @Test
    public void testCheckOnePositiveNegativeNumberPositive(){
        int actual_a =1;
        int actual_b =2;
        int actual_c = 3;
        boolean actual;
        boolean expected = false;

        actual=checkOnePositiveNegativeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckOnePositiveNegativeNumberNegative(){
        int actual_a =-1;
        int actual_b =-2;
        int actual_c = -3;
        boolean actual;
        boolean expected = false;

        actual=checkOnePositiveNegativeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckOnePositiveNegativeNumberWithOnePositiveNumber(){
        int actual_a =1;
        int actual_b =-2;
        int actual_c = -3;
        boolean actual;
        boolean expected = true;

        actual=checkOnePositiveNegativeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckOnePositiveNegativeNumberWithOneNegativeNumber(){
        int actual_a =-1;
        int actual_b =2;
        int actual_c =3;
        boolean actual;
        boolean expected = true;

        actual=checkOnePositiveNegativeNumber(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test(expected =  RuntimeException.class)
    public void testCheckOnePositiveNegativeNumberWithZeroLength(){
        boolean actual;

        actual=checkOnePositiveNegativeNumber(new int[0]);
    }

    @Test(expected =  RuntimeException.class)
    public void testCheckOnePositiveNegativeNumberWithNull(){
        boolean actual;

        actual=checkOnePositiveNegativeNumber(null);
    }



}
