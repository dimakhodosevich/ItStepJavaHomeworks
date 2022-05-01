package by.itstep.khodosevich.elevenstageproject.task09;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.elevenstageproject.task09.module.logic.ArmstrongNumber.*;

public class ArmstrongNumberTest {

    @Test
    public void testGetArmstrongNumberOneDegree() {
        int actualDegree = 1;
        String expected = "1 2 3 4 5 6 7 8 9";

        String actual = getArmstrongNumber(actualDegree);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetArmstrongNumberTwoDegree() {
        int actualDegree = 2;
        String expected = "";

        String actual = getArmstrongNumber(actualDegree);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetArmstrongNumberThirdDegree() {
        int actualDegree = 3;
        String expected = "153 370 371 407";

        String actual = getArmstrongNumber(actualDegree);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetArmstrongNumberFourDegree() {
        int actualDegree = 4;
        String expected = "1634 8208 9474";

        String actual = getArmstrongNumber(actualDegree);
        assertEquals(expected, actual);
    }

    @Test
    public void testGetArmstrongNumberFifthDegree() {
        int actualDegree = 5;
        String expected = "54748 92727 93084";

        String actual = getArmstrongNumber(actualDegree);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testGetArmstrongNumberWithZero() {
        int actualDegree = 0;
        getArmstrongNumber(actualDegree);
    }

    @Test(expected = RuntimeException.class)
    public void testGetArmstrongNumberWithNegativeDegree() {
        int actualDegree = -3;
        getArmstrongNumber(actualDegree);
    }
}
