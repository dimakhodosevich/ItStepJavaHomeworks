package by.itstep.khodosevich.fourproject.module.logic;

public class RiverAndBoat {

    public static double calculateVelocityRiverAndBoat(double velocityRiver, double velocityBoat){
        if(velocityBoat<velocityRiver){
            throw new RuntimeException();
        }
        return velocityRiver+velocityBoat;
    }

    public static double calculateDistanceWhichBoatRide(double velocity, double time){
        if(time<0){
            throw new RuntimeException();
        }
        return velocity*time;
    }

    public static double calculateAllDistance(double length1, double length2){
        if(length1<0 || length2<0){
            throw new RuntimeException();
        }
        return length1+length2;
    }
}
