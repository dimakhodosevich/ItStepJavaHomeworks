package by.itstep.khodosevich.secondproject.module.data;

public class Storage {
    public final static int STORAGE_COEFFICIENT = 1024;

    public static long translateByteIntoKilobyte(long bytee){
        if(bytee<=0){
            throw new RuntimeException();
        }
        return bytee/STORAGE_COEFFICIENT;
    }

    public static int translateKilobyteIntoMegabyte(long kilobyte){
        if(kilobyte<=0){
            throw new RuntimeException();
        }
        return (int)(kilobyte/STORAGE_COEFFICIENT);
    }

    public static int translateMegabyteIntoGigabyte(int megabyte){
        if(megabyte<=0){
            throw new RuntimeException();
        }
        return megabyte/STORAGE_COEFFICIENT;
    }

    public static int translateGigabyteIntoTerabyte(int gigabyte){
        if(gigabyte<=0){
            throw new RuntimeException();
        }
        return gigabyte/STORAGE_COEFFICIENT;
    }

}
