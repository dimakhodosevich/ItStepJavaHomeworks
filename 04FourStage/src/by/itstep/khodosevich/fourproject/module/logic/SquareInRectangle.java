package by.itstep.khodosevich.fourproject.module.logic;

public class SquareInRectangle {

    public static int calculateSquareInLength(double lengthOfRectangle, double lengthOfSquare){
        if(lengthOfRectangle<0 || lengthOfSquare<0){
            throw new RuntimeException();
        }

        return (int)(lengthOfRectangle/lengthOfSquare);
    }

    public static int calculateSquareInWidth(double widthOfRectangle, double lengthOfSquare){
        if(widthOfRectangle<0 || lengthOfSquare<0){
            throw new RuntimeException();
        }

        return (int)(widthOfRectangle/lengthOfSquare);
    }




}
