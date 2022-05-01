package by.itstep.khodosevich.sevenproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.sevenproject.module.logic.VowelAndConsonant.*;

public class TestVowelAndConsonant {

    @Test
    public void testCheckLetterPositiveA() {
        char actual_letter = 'a';
        boolean actual;
        boolean expected = true;

        actual = checkLetter(actual_letter);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckLetterPositiveE() {
        char actual_letter = 'e';
        boolean actual;
        boolean expected = true;

        actual = checkLetter(actual_letter);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckLetterPositiveI() {
        char actual_letter = 'i';
        boolean actual;
        boolean expected = true;

        actual = checkLetter(actual_letter);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckLetterPositiveO() {
        char actual_letter = 'o';
        boolean actual;
        boolean expected = true;

        actual = checkLetter(actual_letter);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckLetterPositiveU() {
        char actual_letter = 'u';
        boolean actual;
        boolean expected = true;

        actual = checkLetter(actual_letter);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckLetterPositiveY() {
        char actual_letter = 'Y';
        boolean actual;
        boolean expected = true;

        actual = checkLetter(actual_letter);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckLetterNegativeR() {
        char actual_letter = 'r';
        boolean actual;
        boolean expected = false;

        actual = checkLetter(actual_letter);
        assertEquals(expected, actual);
    }

}
