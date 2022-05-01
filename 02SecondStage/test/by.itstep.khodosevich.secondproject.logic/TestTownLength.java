package by.itstep.khodosevich.secondproject.logic;

import by.itstep.khodosevich.secondproject.module.data.TownLength;
import org.junit.Assert;
import org.junit.Test;


public class TestTownLength {

    @Test
    public void testTranslateCentimeterInMeterPositive(){
        long actual = 123456789l;
        int expected = 1234567;

        actual = TownLength.translateCentimeterInMeter(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected =  RuntimeException.class)
    public void testTranslateCentimeterInMeterNegative(){
        long actual = -1;

        TownLength.translateCentimeterInMeter(actual);
    }

    @Test
    public void testTranslateMeterInKilometrPositive(){
        int actual = 123456789;
        int expected = 123456;

        actual = TownLength.translateMeterInKilometr(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected =  RuntimeException.class)
    public void testTranslateMeterInKilometrNegative(){
        int actual = -1;

        TownLength.translateMeterInKilometr(actual);
    }
}
