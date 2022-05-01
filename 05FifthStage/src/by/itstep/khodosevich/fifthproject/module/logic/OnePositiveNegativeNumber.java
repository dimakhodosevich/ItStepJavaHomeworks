package by.itstep.khodosevich.fifthproject.module.logic;

public class OnePositiveNegativeNumber {
    public static boolean checkOnePositiveNegativeNumber(int... array){

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

        return positive_counter==1||negative_counter==1;
    }

}
