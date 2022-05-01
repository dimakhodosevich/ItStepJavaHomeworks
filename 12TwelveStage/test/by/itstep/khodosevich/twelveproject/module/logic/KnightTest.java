package by.itstep.khodosevich.twelveproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.twelveproject.module.logic.Knight.*;

public class KnightTest {

    @Test
    public void testIsValidKnightStepPositiveYes() {
        int[] startPoint = {3, 6};
        int[][] stepPoint = {{1, 7}, {2, 8}, {4, 8}, {5, 7}, {4, 4}, {5, 5}, {1, 5}, {2, 4}};
        String expected = "YES";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidKnightStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidKnightStepPositiveNo() {
        int[] startPoint = {3, 6};
        int[][] stepPoint = {{3, 6}, {5, 3}, {7, 5}, {8, 6}, {5, 4}, {7, 4}, {6, 3}, {6, 5}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidKnightStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidKnightStepNegativeForBoard() {
        int[] startPoint = {3, 6};
        int[][] stepPoint = {{3, 9}, {0, 3}, {0, 5}, {0, 6}, {9, 4}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidKnightStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidKnightStepNegativeForPiece() {
        int[] startPoint = {9, 1};
        int[][] stepPoint = {{3, 9}, {0, 3}, {0, 5}, {0, 6}, {9, 4}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidKnightStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

}
