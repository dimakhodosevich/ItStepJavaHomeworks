package by.itstep.khodosevich.elevenstageproject.task05.module.logic;


public class PrimeNumber {

    private static final String ERROR_PRIME_NUMBER;

    static {
        ERROR_PRIME_NUMBER = "Your number lower than 2!!!";
    }

    private PrimeNumber() {
    }

    public static boolean isPrimeNumber(double number) {
        int numberInt = (int) number;

        if (numberInt < 2) {
            System.err.println(ERROR_PRIME_NUMBER);
            throw new RuntimeException();
        }

        int counter = 1;
        for (int i = 2; i * i <= numberInt; i++) {

            if (numberInt % i == 0) {
                counter++;
            }
        }

        return counter == 1;
    }
}
