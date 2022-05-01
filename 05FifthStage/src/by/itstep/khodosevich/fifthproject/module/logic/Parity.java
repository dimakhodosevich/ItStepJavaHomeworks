package by.itstep.khodosevich.fifthproject.module.logic;

public class Parity {
    public static boolean checkParity(int ... var){

        if(var==null || var.length==0){
            throw new RuntimeException();
        }

        for(int i = 0; i<var.length; i++){
            if(var[i]%2!=0){
                return false;
            }
        }

        return true;
    }
}
