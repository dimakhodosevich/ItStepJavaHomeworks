package by.itstep.khodosevich.twelveproject.module.logic;

public class ChessBoard {

    public static boolean isChessBoardCell(int x, int y) {
        return (x >= 1 && x <= 8) && (y >= 1 && y <= 8);
    }

}
