package by.itstep.khodosevich.fifthproject.module.logic;

public class ReverseNumber {
    public static long reverseNumber(long var1){

        long reverse_var1 = var1%10;
        var1/=10;

        while(var1!=0){
            long previous_number = var1%10;
            var1/=10;

            if(previous_number==0){
                continue;
            }

            reverse_var1=reverse_var1*10+previous_number;
        }

        return reverse_var1;
    }
}
