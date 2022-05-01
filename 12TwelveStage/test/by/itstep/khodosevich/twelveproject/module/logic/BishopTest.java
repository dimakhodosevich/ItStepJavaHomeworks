package by.itstep.khodosevich.twelveproject.module.logic;

import org.junit.Test;

import static by.itstep.khodosevich.twelveproject.module.logic.Bishop.*;
import static org.junit.Assert.assertEquals;

public class BishopTest {

    @Test
    public void testIsValidBishopStepPositiveYes() {
        int[] startPoint = {6, 4};
        int[][] stepPoint = {{8, 2}, {7, 3}, {5, 5}, {4, 6}, {3, 7}, {2, 8}, {3, 1}, {4, 2}, {5, 3}, {7, 5}, {8, 6}};
        String expected = "YES";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidBishopStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidKingStepPositiveNo() {
        int[] startPoint = {6, 4};
        int[][] stepPoint = {{6, 4}, {5, 4}, {7, 4}, {6, 3}, {6, 5}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidBishopStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidKingStepNegativeForBoard() {
        int[] startPoint = {6, 4};
        int[][] stepPoint = {{8, 0}, {1, 0}, {9, 3}, {1, 9}, {0, 0}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidBishopStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testIsValidKingStepNegativeForPiece() {
        int[] startPoint = {9, 4};
        int[][] stepPoint = {{8, 0}, {1, 0}, {9, 3}, {1, 9}, {0, 0}};
        String expected = "NO";

        for (int i = 0; i < stepPoint.length; i++) {
            String actual = isValidBishopStep(startPoint[0], startPoint[1], stepPoint[i][0], stepPoint[i][1]);
            assertEquals(expected, actual);
        }
    }

}
