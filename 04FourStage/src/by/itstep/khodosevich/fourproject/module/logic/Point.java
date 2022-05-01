package by.itstep.khodosevich.fourproject.module.logic;

public class Point {
    public static double calculatePointX(double x1, double x2){
        return x1-x2;
    }

    public static double calculatePointY(double y1, double y2){
        return y1-y2;
    }

    public static double findDistanceBetweenTwoPoint(double x, double y){
        x= x>0?x:-x;
        y= y>0?y:-y;

        return Triangle.calculateHypotenuseOfTriangle(x,y);
    }
}
