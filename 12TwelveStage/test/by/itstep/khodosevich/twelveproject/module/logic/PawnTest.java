package by.itstep.khodosevich.twelveproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.twelveproject.module.logic.Pawn.*;

public class PawnTest {

    @Test
    public void testIsValidPawnStepPositiveYes() {
        int[] startPoint = {7, 4};
        int[][] stepPoint = {{6, 4}, {5, 4}};
        String expected = "YES";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidPawnStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidPawnStepPositiveNo() {
        int[] startPoint = {7, 4};
        int[][] stepPoint = {{8, 4}, {4, 4}, {6, 5}, {6, 3}, {7, 3}, {7, 2}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidPawnStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidPawnStepNegativeNoForBoard() {
        int[] startPoint = {7, 4};
        int[][] stepPoint = {{9, 0}, {0, 9}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidPawnStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidPawnStepNegativeNoForPiece() {
        int[] startPoint = {0, 4};
        int[][] stepPoint = {{8, 4}, {8, 3}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidPawnStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

}
