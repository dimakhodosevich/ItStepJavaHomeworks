package by.itstep.khodosevich.elevenstageproject.task01.module.logic;

public class NumberSumAndCounter {

    private NumberSumAndCounter() {
    }

    public static int getSumOfValue(double value) {
        int valueInt = (int) value;
        valueInt = valueInt > 0 ? valueInt : -valueInt;

        int sum = 0;

        while (valueInt > 0) {
            int lastNumber = valueInt % 10;
            sum += lastNumber;
            valueInt /= 10;
        }

        return sum;
    }


    public static int countNumberOfValue(double value) {
        int valueInt = (int) value;
        valueInt = valueInt > 0 ? valueInt : -valueInt;

        int counter = 0;

        if(valueInt==0){
            return counter=1;
        }

        while (valueInt > 0) {
            valueInt /= 10;
            counter++;
        }

        return counter;
    }
}
