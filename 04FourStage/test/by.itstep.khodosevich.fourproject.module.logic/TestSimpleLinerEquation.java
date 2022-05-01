package by.itstep.khodosevich.fourproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourproject.module.logic.SimpleLinearEquation.*;

public class TestSimpleLinerEquation {

    @Test
    public void testResolveSimpleLinerEquationPositive(){
        double actual_a = 5;
        double actual_b = 6;
        double actual;
        double expected = -1.2;
        double delta = 0.001;

        actual = resolveSimpleLinerEquation(actual_a, actual_b);
        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testResolveSimpleLinerEquationWithZeroCoefficient(){
        double actual_a = 0;
        double actual_b = 6;
        double actual;

        actual = resolveSimpleLinerEquation(actual_a, actual_b);
    }


}
