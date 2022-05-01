package by.itstep.khodosevich.fourproject.module.logic;

public class Triangle {
    public static double calculateSquareOfTriangle(double length, double width){
        if(length<0 || width<0){
            throw new RuntimeException();
        } else if(length==0 || width==0){
            return 0;
        }

        return length*width/2;
    }

    public static double calculateHypotenuseOfTriangle(double length, double width){
        if(length<0 || width<0){
            throw new RuntimeException();
        }else if(length==0 || width==0){
            return 0;
        }

        return Math.sqrt(length*length+width*width);
    }

    public static double calculatePerimeterOfTriangle(double length, double width){
        if(length<0 || width<0){
            throw new RuntimeException();
        } else if(length==0 || width==0){
            return 0;
        }

        double hypotenuse = calculateHypotenuseOfTriangle(length, width);

        return length+width+hypotenuse;
    }

}
