package by.itstep.khodosevich.elevenstageproject.task03.logic.module;

import java.util.Random;

import static by.itstep.khodosevich.elevenstageproject.view.Printer.*;

public class HeadsAndTails {
    private static final Random RANDOM;

    static {
        RANDOM = new Random();
    }

    private HeadsAndTails() {
    }

    public static double getStatisticOfHead(int number) {

        if (number <= 0) {
            System.err.println(ERROR_MESSAGE);
            throw new RuntimeException();
        }

        int counter = 0;
        int head = 0;

        while (number != counter) {

            int result = RANDOM.nextInt(2);

            if (result == 1) {
                head++;
            }
            counter++;
        }
        return head / (double) number;
    }

    public static double getStatisticOfTail(int number) {
        return 1 - getStatisticOfHead(number);
    }


}
