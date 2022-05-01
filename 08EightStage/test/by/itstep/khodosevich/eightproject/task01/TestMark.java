package by.itstep.khodosevich.eightproject.task01;

import org.junit.Test;

import static by.itstep.khodosevich.eightproject.task01.logic.Mark.*;
import static org.junit.Assert.*;

public class TestMark {

    @Test
    public void testGetStringEquivalentOfMarkPositive(){
        int[] actual_marks = {0,1,2,3,4,5,6,7,8,9,10};

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(VERY_BAD_MARK).append(VERY_BAD_MARK).append(UNSATISFACTORY_MARK).
                append(UNSATISFACTORY_MARK).append(SATISFACTORY_MARK).append(NOT_BAD_MARK).
                append(NOT_BAD_MARK).append(NICE_MARK).append(NICE_MARK).append(Great_MARK).
                append(AWESOME_MARK);

        String expected = stringBuilder+"";
        String actual = "";

        for(int element: actual_marks){
            actual += String.format(getStringEquivalentOfMark(element));
        }

        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testGetStringEquivalentOfMarkNegativeWithNegativeMark(){
        int actual_marks = -1;
        getStringEquivalentOfMark(actual_marks);
    }


    @Test (expected = RuntimeException.class)
    public void testGetStringEquivalentOfMarkNegativeWithUpperPositiveMark(){
        int actual_marks = 11;
        getStringEquivalentOfMark(actual_marks);
    }
}
