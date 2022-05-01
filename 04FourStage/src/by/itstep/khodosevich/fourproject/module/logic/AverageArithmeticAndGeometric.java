package by.itstep.khodosevich.fourproject.module.logic;

public class AverageArithmeticAndGeometric {

    public static double calculateAverageArithmeticValue(double... array){
        double sum = 0;

        for(double element: array){
            if(element<0){
                throw new RuntimeException();
            }
            sum+=element;
        }

        return sum/array.length;
    }

    public static double calculateAverageGeometricValue(double... array){

        double mult = 1;

        for(double element: array){
            if(element<0){
                throw new RuntimeException();
            }
            mult*=element;
        }

        return Math.pow(mult, 1./array.length);
    }

}
