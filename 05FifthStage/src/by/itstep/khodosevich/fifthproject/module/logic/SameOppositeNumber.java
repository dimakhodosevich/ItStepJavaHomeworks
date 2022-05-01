package by.itstep.khodosevich.fifthproject.module.logic;

public class SameOppositeNumber {

    public static boolean checkTheSameOppositeNumber(int... array) {

        if(array==null || array.length==0){
            throw new RuntimeException();
        }

        for (int i = 0; i < array.length-1; i++) {

            int element = array[i] >= 0 ? array[i] : -array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (element == array[j]) {
                    if(array[i]!=array[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
