package by.itstep.khodosevich.secondproject.logic;

import by.itstep.khodosevich.secondproject.module.data.Dinosaur;
import org.junit.Test;
import org.junit.Assert;

public class TestDinosaur {

    @Test
    public void testTranslateGrammToKillogrammPosivite(){
        long actual = 123_456_789l;
        int expected = 123_456;

        actual = Dinosaur.translateGrammToKillogramm(actual);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTranslateGrammToKillogrammNegative(){
        long actual = -123_456_789l;
        int expected = -1;

        actual = Dinosaur.translateGrammToKillogramm(actual);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTranslateKillogrammToCentnerPositive(){
        int actual = 123_456_789;
        int expected = 123_456_7;

        actual = Dinosaur.translateKillogrammToCentner(actual);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTranslateKillogrammToCentnerNegative(){
        int actual = -123_456_789;
        int expected = -1;

        actual = Dinosaur.translateKillogrammToCentner(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTranslateCentnerToTonPositive(){
        int actual = 123_456_789;
        int expected = 123_456_78;

        actual = Dinosaur.translateCentnerToTon(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTranslateCentnerToTonNegative(){
        int actual = -123_456_789;
        int expected = -1;

        actual = Dinosaur.translateCentnerToTon(actual);
        Assert.assertEquals(expected, actual);
    }

}
