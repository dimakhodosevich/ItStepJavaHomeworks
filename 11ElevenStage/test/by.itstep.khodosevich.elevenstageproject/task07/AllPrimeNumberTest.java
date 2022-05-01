package by.itstep.khodosevich.elevenstageproject.task07;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task07.module.logic.AllPrimeNumber.*;

public class AllPrimeNumberTest {

    @Test
    public void testGetEratosthenesCellPositiveSeven() {
        int actual_number = 7;
        String expected = "7.";

        String actual = getAllPrimeNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetEratosthenesCellPositiveEleven() {
        int actual_number = 14;
        String expected = "2, 7.";

        String actual = getAllPrimeNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetEratosthenesCellPositiveNine() {
        int actual_number = 9;
        String expected = "3.";

        String actual = getAllPrimeNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetEratosthenesCellPositiveFifteen() {
        int actual_number = 15;
        String expected = "3, 5.";

        String actual = getAllPrimeNumber(actual_number);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetEratosthenesCellNegativeWithOne() {
        int actual_number = 1;

        getAllPrimeNumber(actual_number);
    }

    @Test(expected = RuntimeException.class)
    public void testGetEratosthenesCellNegativeWithZero() {
        int actual_number = 0;

        getAllPrimeNumber(actual_number);
    }

}
