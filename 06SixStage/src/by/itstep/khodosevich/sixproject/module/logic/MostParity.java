package by.itstep.khodosevich.sixproject.module.logic;

public class MostParity {
    public static boolean checkMostParityNumber(int ... array){

        int positive_number = 0;
        int negative_number = 0;

        for(int i = 0; i<array.length; i++){
            if(array[i]%2==0){
                ++positive_number;
            } else{
                ++negative_number;
            }
        }
        return positive_number>negative_number;
    }
}
