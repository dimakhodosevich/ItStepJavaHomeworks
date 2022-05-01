package by.itstep.khodosevich.nineproject.task03.module.logic;

// написать константы +
// написать логику для генерации чисел +
// написать логику для подсчета очков +

import java.util.Random;

public class Dice {

    public static final int MIN_POINT = 1;
    public static final int MAX_POINT = 6;

    public static int generateDicePoint(){
        Random random = new Random();
        int generatedNumber = random.nextInt(MAX_POINT-MIN_POINT+1)+1;

        return generatedNumber;
    }

    public static int calculateDicePoint(double... points){
        if(points == null || points.length == 0){
            throw new RuntimeException();
        }

        double result = 0;

        for(double element: points){
            if(element<1){
                throw new RuntimeException();
            }
            result+=element;
        }
        return (int)result;
    }
}
