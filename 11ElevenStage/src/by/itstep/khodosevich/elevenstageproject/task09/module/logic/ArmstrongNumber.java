package by.itstep.khodosevich.elevenstageproject.task09.module.logic;

public class ArmstrongNumber {

    private static final String ERROR;

    static {
        ERROR = "Your number lower than 1";
    }

    private ArmstrongNumber() {

    }

    public static String getArmstrongNumber(int number) {

        if (number < 1) {
            System.err.println(ERROR);
            throw new RuntimeException();
        }

        int maxValue = (int) Math.pow(10, number) - 1;
        int minValue = (int) Math.pow(10, number - 1);
        StringBuilder stringBuilder = new StringBuilder();

        while (minValue <= maxValue) {

            int sum = 0;
            int temp = minValue;

            while (temp > 0) {
                int lastNumber = temp % 10;
                temp /= 10;
                sum += Math.pow(lastNumber, number);
            }

            if (sum == minValue) {
                stringBuilder.append(sum).append(" ");
            }

            minValue++;
        }

        String result = stringBuilder + "";
        result = result.trim();
        return result;
    }
}
