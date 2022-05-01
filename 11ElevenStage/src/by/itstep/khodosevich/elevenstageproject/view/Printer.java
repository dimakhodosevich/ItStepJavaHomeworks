package by.itstep.khodosevich.elevenstageproject.view;

public class Printer {

    public static final String ERROR_MESSAGE;

    static{
        ERROR_MESSAGE = "Your method works bad!!!";
    }

    public static void print(Object message) {
        System.out.print(message);
    }
}
