package by.itstep.khodosevich.nineproject.task03;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.nineproject.task03.module.logic.Dice.*;

public class TestDice {

    @Test
    public void testCalculateDicePointWithPositiveNumbers(){
        double actual_var1 = 5.0;
        double actual_var2 = 5.0;
        int expected = 10;

        int actual = calculateDicePoint(actual_var1, actual_var2);
        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testCalculateDicePointWithNegativeNumber(){
        double actual_var1 = 5.0;
        double actual_var2 = -5.0;

        calculateDicePoint(actual_var1, actual_var2);
    }

    @Test (expected = RuntimeException.class)
    public void testCalculateDicePointWithNull(){

        calculateDicePoint(null);
    }

    @Test (expected = RuntimeException.class)
    public void testCalculateDicePointWithZeroLength(){

        calculateDicePoint(new double[0]);
    }

}
