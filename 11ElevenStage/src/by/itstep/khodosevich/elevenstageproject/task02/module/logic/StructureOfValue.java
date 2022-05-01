package by.itstep.khodosevich.elevenstageproject.task02.module.logic;

import static by.itstep.khodosevich.elevenstageproject.view.Printer.*;

public class StructureOfValue {

    public static String getCounterDifferentNumber(double value) {

        int valueInt = (int) value;

        if (valueInt <= 0) {
            System.out.println(ERROR_MESSAGE);
            throw new RuntimeException();
        }

        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;

        while (valueInt > 0) {

            int lastNumber = valueInt % 10;
            valueInt /= 10;
            int counter = 1;
            int temp = valueInt;

            while (temp > 0) {
                int previousNumber = temp % 10;
                temp /= 10;

                if (lastNumber == previousNumber) {
                    counter++;
                }
            }

            String msg = lastNumber+" - ";
            if(stringBuilder.lastIndexOf(msg)==-1) {
                stringBuilder.append(msg).append(counter).append(" occasion;\n");
            }
        }

        stringBuilder.setLength(stringBuilder.length()-2);

        return stringBuilder + ".";
    }
}
