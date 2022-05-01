package by.itstep.khodosevich.sixproject.module.logic;

public class AllParity {
    public static boolean checkAllParityNumber(int ... array){

        int positive_number = 0;

        for(int i = 0; i<array.length; i++){
            if(array[i]%2==0){
                ++positive_number;
            }
        }
        return positive_number==array.length;
    }
}
