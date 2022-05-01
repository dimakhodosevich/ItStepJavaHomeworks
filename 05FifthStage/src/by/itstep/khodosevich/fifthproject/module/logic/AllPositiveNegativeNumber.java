package by.itstep.khodosevich.fifthproject.module.logic;

public class AllPositiveNegativeNumber {

    public static boolean checkAllNumber(int ... array){

        if(array==null || array.length==0){
            throw new RuntimeException();
        }

        for(int element: array){
            if(element<0){
                return false;
            }
        }

        return true;
    }
}
