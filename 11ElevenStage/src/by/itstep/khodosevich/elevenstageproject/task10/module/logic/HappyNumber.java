package by.itstep.khodosevich.elevenstageproject.task10.module.logic;

public class HappyNumber {
    private static final String ERROR;

    static {
        ERROR = "Your number doesn't consist from 6 numbers!!!";
    }

    private HappyNumber() {

    }

    public static boolean isHappyNumber(int number) {

        if (number == 0) {
            return true;
        }

//        String msg = number + "";
//
//        if (msg.length() > 6) {
//            System.err.println(ERROR);
//            throw new RuntimeException();
//        }
//          add comment
        int sum1 = 0;
        int sum2 = 0;
        int counter = 0;

        while (number > 0) {
            int lastNumber = number % 10;
            number /= 10;

            if (counter < 3) {
                sum2 += lastNumber;
            } else {
                sum1 += lastNumber;
            }
            counter++;
        }

        if (counter != 6) {
            System.err.println(ERROR);
            throw new RuntimeException();
        }

        return sum1 == sum2;
    }

}
