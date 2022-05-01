package by.itstep.khodosevich.sixproject.module.logic;

public class Coordinate {
    public static boolean checkCoordinate(int x1, int y1, int x2, int y2, int point_x1, int point_y1){

        if(x1<=point_x1 && y1>=point_y1 && x2>=point_x1 && y2<=point_y1){
            return true;
        }

        return false;
    }
}
