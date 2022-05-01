package by.itstep.khodosevich.elevenstageproject.task08.module.logic;

public class LeastCommonMultiple {

    private static final String ERROR;

    static {
        ERROR = "You entered unaccepted number (lower than 2)!!!";
    }

    private LeastCommonMultiple() {

    }

    public static int getLeastCommonMultiple(int var1, int var2) {

        if (var1 < 2 || var2 < 2) {
            System.err.println(ERROR);
            throw new RuntimeException();
        }

        int maxValue = var1 > var2 ? var1 : var2;
        int minvalue = var1 < var2 ? var1 : var2;
        int hightCommonMultiple = var1 * var2;
        int leastCommonMultiple = hightCommonMultiple;


        for (int i = 0; i < minvalue; i++) {
            hightCommonMultiple -= maxValue;

            if (hightCommonMultiple % minvalue == 0 && hightCommonMultiple > minvalue) {
                leastCommonMultiple = hightCommonMultiple;
            }
        }

        return leastCommonMultiple;
    }
}
