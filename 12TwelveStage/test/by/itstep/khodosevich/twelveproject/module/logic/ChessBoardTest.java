package by.itstep.khodosevich.twelveproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.twelveproject.module.logic.ChessBoard.*;

public class ChessBoardTest {

    @Test
    public void testIsChessBoardCellPositiveTrue() {
        int[][] actual_points = {{1, 1}, {8, 1}, {1, 8}, {8, 8}, {6, 6}, {5, 3}};
        boolean expected = true;

        for (int i = 0; i < actual_points.length; i++) {
            boolean actual = isChessBoardCell(actual_points[i][0], actual_points[i][1]);
            assertTrue("Error with " + i, actual);
        }
    }

    @Test
    public void testIsChessBoardCellPositiveFalse() {
        int[][] actual_points = {{0, 1}, {8, 0}, {0, 8}, {8, 0}, {6, 0}, {12, 3}};
        boolean expected = false;

        for (int i = 0; i < actual_points.length; i++) {
            boolean actual = isChessBoardCell(actual_points[i][0], actual_points[i][1]);
            assertFalse("Error with " + i, actual);
        }
    }

}
