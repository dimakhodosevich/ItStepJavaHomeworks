package by.itstep.khodosevich.elevenstageproject.task08.module.logic;

public class GreatestCommonDivisor {

    private static final String ERROR;

    static {
        ERROR = "You entered unaccepted number (lower than 2)!!!";
    }

    private GreatestCommonDivisor() {

    }

    public static int getGreatestCommonDivisor(int var1, int var2) {

        if (var1 < 2 || var2 < 2) {
            System.err.println(ERROR);
            throw new RuntimeException();
        }

        int minNumber = var1 < var2 ? var1 : var2;
        int greatestCommonDivisor = -1;

        for (int i = 2; i < minNumber; i++) {
            if (var1 % i == 0 && var2 % i == 0) {
                greatestCommonDivisor = i;
                break;
            }
        }

        return greatestCommonDivisor;
    }

}
