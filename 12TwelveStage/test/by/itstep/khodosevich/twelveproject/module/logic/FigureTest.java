package by.itstep.khodosevich.twelveproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.twelveproject.module.logic.Figure.*;

public class FigureTest {

    @Test
    public void testGetFigure() {
        int[] numbersOfFigure = {1, 2, 3, 4, 5, 6, 7, 0};
        String[] expectedNames = {"King", "Queen", "Bishop", "Knight", "Rook", "Pawn", "Incorrect number", "Incorrect number"};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numbersOfFigure.length; i++) {
            assertEquals("Error with " + i, expectedNames[i], getFigure(numbersOfFigure[i]));
        }
    }
}
