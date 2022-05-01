package by.itstep.khodosevich.fifthproject.module.logic;

public class AscendNumber {

    public static boolean checkAscendNumber(long var1) {

        long last_number = var1 % 10;
        var1 /= 10;

        if (var1 == 0) {
            throw new RuntimeException();
        }

        while (var1 != 0) {
            long previous_number = var1 % 10;
            var1 /= 10;

            if (last_number < previous_number) {
                return false;
            }

            last_number = previous_number;
        }
        return true;
    }
}
