package by.itstep.khodosevich.sevenproject.module.logic;

import org.junit.Test;

import static org.junit.Assert.*;
import static by.itstep.khodosevich.sevenproject.module.logic.QuadraticEquation.*;

public class TestQuadraticEquation {

    @Test
    public void testResolveQuadraticEquationPositiveWithTwoRoots() {
        double actual_a = 1.25;
        double actual_b = 5;
        double actual_c = 2;
        String expected = "Discriminant>0 (D=15,00). Equation has two roots x1=-0,45; x2=-3,55.";

        String actual = resolveQuadraticEquation(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testResolveQuadraticEquationPositiveWithOneRoots() {
        double actual_a = 1;
        double actual_b = 4;
        double actual_c = 4;
        String expected = "Discriminant=0 (D=0,00). Equation has one root x1=-2,00.";

        String actual = resolveQuadraticEquation(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test
    public void testResolveQuadraticEquationNegativeWithoutRoots() {
        double actual_a = 1;
        double actual_b = 4;
        double actual_c = 5;
        String expected = "Discriminant<0 (D=-4,00). Equation doesn't has any root.";

        String actual = resolveQuadraticEquation(actual_a, actual_b, actual_c);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testResolveQuadraticEquationNegativeZeroArgument() {
        double actual_a = 0;
        double actual_b = 4;
        double actual_c = 5;

        String actual = resolveQuadraticEquation(actual_a, actual_b, actual_c);
    }


}
