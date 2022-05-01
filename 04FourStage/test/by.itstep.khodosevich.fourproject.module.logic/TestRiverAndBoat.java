package by.itstep.khodosevich.fourproject.module.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import static by.itstep.khodosevich.fourproject.module.logic.RiverAndBoat.*;

public class TestRiverAndBoat {

    @Test
    public void testCalculateVelocityRiverAndBoatPositive(){
        double actual_velocityRiver = 5;
        double actual_velocityBoat = 10;
        double actual;
        double expected = 15;
        double delta = 0.001;

        actual = calculateVelocityRiverAndBoat(actual_velocityRiver, actual_velocityBoat);
        assertEquals(expected, actual,delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateVelocityRiverAndBoatNegative(){
        double actual_velocityRiver = 10;
        double actual_velocityBoat = 5;
        double actual;

        actual = calculateVelocityRiverAndBoat(actual_velocityRiver, actual_velocityBoat);
    }

    @Test
    public void testCalculateDistanceWhichBoatRidePositive(){
        double actual_velocity = 5;
        double actual_time = 5;
        double actual;
        double expected = 25;
        double delta = 0.001;

        actual = calculateDistanceWhichBoatRide(actual_velocity, actual_time);
        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateDistanceWhichBoatRideNegative(){
        double actual_velocity = 5;
        double actual_time =-5;
        double actual;

        actual = calculateDistanceWhichBoatRide(actual_velocity, actual_time);
    }

    @Test
    public void testCalculateAllDistancePositive(){
        double actual_length1 = 5;
        double actual_length2 = 5;
        double actual;
        double expected = 10;
        double delta = 0.001;

        actual = calculateAllDistance(actual_length1, actual_length2);
        assertEquals(expected, actual, delta);
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateAllDistanceNegative(){
        double actual_length1 = 5;
        double actual_length2 = -5;
        double actual;

        actual = calculateAllDistance(actual_length1, actual_length2);
    }

}
