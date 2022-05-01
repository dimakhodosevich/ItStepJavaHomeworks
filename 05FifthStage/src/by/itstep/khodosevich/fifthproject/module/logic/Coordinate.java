package by.itstep.khodosevich.fifthproject.module.logic;

public class Coordinate {

    public static final int COORDINATE_PART_1 = 1;
    public static final int COORDINATE_PART_2 = 2;
    public static final int COORDINATE_PART_3 = 3;
    public static final int COORDINATE_PART_4 = 4;

    public static int checkCoordinate(int x, int y){

        int result = COORDINATE_PART_4;

        if(x==0 || y==0){
            throw new RuntimeException();
        }

        if(x>0 && y>0){
            result = COORDINATE_PART_1;
        } else if (x<0 && y>0){
            result = COORDINATE_PART_2;
        } else if( x <0 && y<0){
            result = COORDINATE_PART_3;
        }

        return result;
    }
}
