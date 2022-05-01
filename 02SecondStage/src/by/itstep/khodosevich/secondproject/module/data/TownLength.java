package by.itstep.khodosevich.secondproject.module.data;

public class TownLength {
    public static final int CENTIMETER_IN_METER = 100;
    public static final int METER_IN_KILOMETER=1000;

    public static int translateCentimeterInMeter(long centimeter){
        if(centimeter<=0){
            throw new RuntimeException();
        }
        return (int)(centimeter/CENTIMETER_IN_METER);
    }

    public static int translateMeterInKilometr(int meter){
        if(meter<=0){
            throw new RuntimeException();
        }
        return (int)(meter/METER_IN_KILOMETER);
    }

}
