package by.itstep.khodosevich.fourproject.module.logic;

public class SimpleLinearEquation {

    public static double resolveSimpleLinerEquation(double a, double b){
        if(a==0){
            throw new RuntimeException();
        }

        return -b/a;
    }
}
