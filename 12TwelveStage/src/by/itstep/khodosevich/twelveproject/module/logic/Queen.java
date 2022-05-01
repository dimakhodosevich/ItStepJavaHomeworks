package by.itstep.khodosevich.twelveproject.module.logic;

public class Queen {

    public static String isValidQueenStep(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return "NO";
        }

        if (x2 < 1 || x2 > 8 || y2 < 1 || y2 > 8) {
            return "NO";
        }

        int x = x1 - x2;
        x = x > 0 ? x : -x;
        int y = y1 - y2;
        y = y > 0 ? y : -y;

        return (y1 == y2 || x1 == x2 || x == y) ? "YES" : "NO";
    }

}
