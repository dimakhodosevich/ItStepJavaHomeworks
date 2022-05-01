package by.itstep.khodosevich.elevenstageproject.task02;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task02.module.logic.StructureOfValue.*;

public class StructureOfValueTest {

    @Test
    public void testGetCounterDifferentNumberPositiveWithDifferentNumbers() {
        int actualNumber = 12345;
        String expected = "5 - 1;\n4 - 1;\n3 - 1;\n2 - 1;\n1 - 1;\n";

        String actual = getCounterDifferentNumber(actualNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCounterDifferentNumberPositiveWithTheSameNumbers() {
        int actualNumber = 55555;
        String expected = "5 - 5;\n";

        String actual = getCounterDifferentNumber(actualNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCounterDifferentNumberPositiveWithRepeatedNumber() {
        int actualNumber = 51515;
        String expected = "5 - 3;\n1 - 2;\n";

        String actual = getCounterDifferentNumber(actualNumber);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetCounterDifferentNumberWithNegativeValue() {
        int actualNumber = -12345;

        String actual = getCounterDifferentNumber(actualNumber);
    }

    @Test(expected = RuntimeException.class)
    public void testGetCounterDifferentNumberWithZero() {
        int actualNumber = 0;

        String actual = getCounterDifferentNumber(actualNumber);
    }

}
