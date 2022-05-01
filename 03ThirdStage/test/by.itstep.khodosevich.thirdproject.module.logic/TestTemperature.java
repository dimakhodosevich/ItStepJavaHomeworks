package by.itstep.khodosevich.thirdproject.module.logic;

import org.junit.Test;
import org.junit.Assert;
import by.itstep.khodosevich.thirdproject.module.data.Temperature;

public class TestTemperature {

    @Test
    public void testTranslateCelciesIntoFahrenheitPositive(){
        double actual = 0;
        double expected = 32;

        actual = Temperature.translateCelciesIntoFahrenheit(actual);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTranslateCelciesIntoKelvinPositive(){
        double actual = 0;
        double expected = 273.15;

        actual = Temperature.translateCelciesIntoKelvin(actual);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTranslateKelvinIntoCelciesPositive(){
        double actual = 0;
        double expected = -273.15;

        actual = Temperature.translateKelvinIntoCelcies(actual);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTranslateKelvinIntoFahrenheitPositive(){
        double actual = 0;
        double expected = -459.67;

        actual = Temperature.translateKelvinIntoFahrenheit(actual);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTranslateFahrenheinIntoCelciesPositive(){
        double actual = 32;
        double expected = 0;

        actual = Temperature.translateFahrenheitIntoCelcies(actual);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testTranslateFahrenheitIntoKelvinPositive(){
        double actual = 0;
        double expected = 255.372;

        actual = Temperature.translateFahrenheitIntoKelvin(actual);
        Assert.assertEquals(expected, actual, 0.001);
    }



}
