package by.itstep.khodosevich.twelveproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.twelveproject.module.logic.Queen.*;

public class QueenTest {


    @Test
    public void testIsValidQueenStepPositiveYes() {
        int[] startPoint = {6, 4};
        int[][] stepPoint = {{8, 2}, {7, 3}, {5, 5}, {4, 6}, {3, 7}, {2, 8}, {3, 1}, {4, 2}, {5, 3}, {7, 5}, {8, 6},
                {5, 4}, {4, 4}, {3, 4}, {2, 4}, {1, 4}, {7, 4}, {8, 4}, {6, 3}, {6, 2}, {6, 1}, {6, 5}, {6, 6},
                {6, 7}, {6, 8}};
        String expected = "YES";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidQueenStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidQueenStepPositiveNo() {
        int[] startPoint = {6, 4};
        int[][] stepPoint = {{6, 4}, {5, 2}, {2, 6}, {1, 1}, {8, 8}, {4, 5}, {5, 7}, {8, 3}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidQueenStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidQueenStepNegativeNoForBoard() {
        int[] startPoint = {6, 4};
        int[][] stepPoint = {{9, 4}, {0, 2}, {9, 6}, {8, 0}, {2, 9}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidQueenStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidQueenStepNegativeNoForPiece() {
        int[] startPoint = {0, 8};
        int[][] stepPoint = {{9, 4}, {0, 2}, {9, 6}, {8, 0}, {2, 9}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidQueenStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

}
