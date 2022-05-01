package by.itstep.khodosevich.twelveproject.module.logic;

public class Pawn {
    public static String isValidPawnStep(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return "NO";
        }

        if (x2 < 1 || x2 > 8 || y2 < 1 || y2 > 8) {
            return "NO";
        }

        if (x1 == 7) {
            return ((x1 - x2 <= 2) && (x1 - x2 > 0) && (y1 == y2)) ? "YES" : "NO";
        }

        return ((x1 - 1 == x2) && (y1 == y2)) ? "YES" : "NO";
    }
}
