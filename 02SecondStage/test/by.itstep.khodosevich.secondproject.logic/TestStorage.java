package by.itstep.khodosevich.secondproject.logic;

import by.itstep.khodosevich.secondproject.module.data.Storage;
import org.junit.Test;
import org.junit.Assert;


public class TestStorage {

    @Test
    public void testTranslateByteIntoKilobytePositive(){
        long actual = 12345678910l;
        long expected =12056327l;

        actual = Storage.translateByteIntoKilobyte(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateByteIntoKilobyteNegative(){
        long actual = -1;

        Storage.translateByteIntoKilobyte(actual);

    }

    @Test
    public void testTranslateKilobyteIntoMegabytePositive(){
        long actual = 12345678910l;
        long expected =12056327l;

        actual = Storage.translateKilobyteIntoMegabyte(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateKilobyteIntoMegabyteNegative(){
        long actual = -1;

        Storage.translateByteIntoKilobyte(actual);
    }

    @Test
    public void testTranslateMegabyteIntoGigabytePositive(){
        int actual = 1234567891;
        int expected =1205632;

        actual = Storage.translateMegabyteIntoGigabyte(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateMegabyteIntoGigabyteNegative(){
        int actual = -1;

        Storage.translateMegabyteIntoGigabyte(actual);
    }

    @Test
    public void testTranslateGigabyteIntoTerabytePositive(){
        int actual = 1234567891;
        int expected =1205632;

        actual = Storage.translateGigabyteIntoTerabyte(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTranslateGigabyteIntoTerabyteNegative(){
        int actual = -1;

        Storage.translateGigabyteIntoTerabyte(actual);
    }


}
