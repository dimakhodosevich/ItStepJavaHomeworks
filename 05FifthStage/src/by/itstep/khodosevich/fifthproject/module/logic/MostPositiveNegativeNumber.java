package by.itstep.khodosevich.fifthproject.module.logic;

public class MostPositiveNegativeNumber {
    public static boolean checkMostPositiveNegativeNumber(int... array){

        if(array==null || array.length==0){
            throw new RuntimeException();
        }

        int positive_counter =0;
        int negative_counter =0;

        for(int element: array){
            if(element<0){
                ++negative_counter;
                continue;
            }
            ++positive_counter;
        }

        return positive_counter>negative_counter;
    }
}
