package by.itstep.khodosevich.fifthproject.module.logic;

public class PositiveNegativeNumber {

    public static boolean checkNumber(int ... var){

        if(var==null || var.length==0){
            throw new RuntimeException();
        }

        int counter_positive = 0;
        int counter_negative = 0;
        int counter_zero = 0;

        for(int element: var)
        {
            if(element == 0){
                counter_zero++;
            }
            else if(element >0){
                counter_positive++;
            }
            else{
                counter_negative++;
            }
        }

        if(counter_zero==var.length){
            throw new RuntimeException();
        }

        return counter_positive>counter_negative;
    }

}
