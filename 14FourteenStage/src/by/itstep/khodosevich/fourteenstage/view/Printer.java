package by.itstep.khodosevich.fourteenstage.view;

public class Printer {
    private static final String ERROR_MESSAGE;

    static {
        ERROR_MESSAGE = "Your range isn't correct!!!";
    }

    private Printer() {
    }

    public static void print(Object message) {
        System.out.print(message);
    }

    public static void printError(Object message) {
        System.err.print(message);
    }
}
