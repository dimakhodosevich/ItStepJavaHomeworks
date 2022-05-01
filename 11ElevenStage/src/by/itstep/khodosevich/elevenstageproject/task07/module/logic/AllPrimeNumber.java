package by.itstep.khodosevich.elevenstageproject.task07.module.logic;

import static by.itstep.khodosevich.elevenstageproject.task05.module.logic.PrimeNumber.*;

public class AllPrimeNumber {
    private static final String ERROR;

    static {
        ERROR = "Your number lower or equals 1.";
    }

    public static String getAllPrimeNumber(int number) {

        if (number < 2) {
            System.err.println(ERROR);
            throw new RuntimeException();
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 2; i <= number; i++) {
            if (isPrimeNumber(i) && number % i == 0) {
                stringBuilder.append(i).append(", ");
            }
        }

        stringBuilder.setLength(stringBuilder.length() - 2);

        return stringBuilder + ".";
    }
}
