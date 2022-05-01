package by.itstep.khodosevich.elevenstageproject.task06.module.logic;

public class Factorial {

    private static final String ERROR;

    static {
        ERROR = "Your entered negative number.";
    }

    private Factorial() {
    }

    public static int calculateFactorial(int number) {

        if (number < 0) {
            System.err.println(ERROR);
            throw new RuntimeException();
        }

        int sum = 1;

        if (number < 2) {
            return sum;
        }

        for (int i = 2; i <= number; i++) {
            sum *= i;
        }

        return sum;
    }
}
