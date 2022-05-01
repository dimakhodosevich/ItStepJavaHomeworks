package by.itstep.khodosevich.fourproject.module.logic;

public class Rectangle {
    public static double calculateSquareOfRectangle(double length, double width){
        if(length<0 || width<0){
            throw new RuntimeException();
        }

        return length*width;
    }

    public static double calculatePerimeterOfRectangle(double length, double width){
        if(length<0 || width<0){
            throw new RuntimeException();
        }

        return 2*length+2*width;
    }
}
