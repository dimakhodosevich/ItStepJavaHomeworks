package by.itstep.khodosevich.sixproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.sixproject.module.logic.Palindrome.*;

public class TestPalindrome {

    @Test
    public void testCheckPalindromePositive(){
        long actual_var = 123321l;
        boolean actual;
        boolean expected = true;

        actual = checkPalindrome(actual_var);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckPalindromeNegative(){
        long actual_var = 123123l;
        boolean actual;
        boolean expected = false;

        actual = checkPalindrome(actual_var);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckPalindromeWithOneNumber(){
        long actual_var = 1l;
        boolean actual;
        boolean expected = false;

        actual = checkPalindrome(actual_var);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckPalindromeWithTwoNumber(){
        long actual_var = 11l;
        boolean actual;
        boolean expected = true;

        actual = checkPalindrome(actual_var);
        assertEquals(expected, actual);
    }

}
