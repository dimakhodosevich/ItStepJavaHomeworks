package by.itstep.khodosevich.twelveproject.module.logic;

public class Figure {

    public static String getFigure(int typeOfFigure) {

        String name = "Incorrect number";

        switch (typeOfFigure) {
            case 1:
                name = "King";
                break;
            case 2:
                name = "Queen";
                break;
            case 3:
                name = "Bishop";
                break;
            case 4:
                name = "Knight";
                break;
            case 5:
                name = "Rook";
                break;
            case 6:
                name = "Pawn";
                break;
        }

        return name;
    }

    public static String moveChessFigure(int x1, int y1, int x2, int y2, int typeOfFigure) {

        String result = "";

        switch (typeOfFigure) {
            case 1:
                result = King.isValidKingStep(x1, y1, x2, y2);
                break;
            case 2:
                result = Queen.isValidQueenStep(x1, y1, x2, y2);
                break;
            case 3:
                result = Bishop.isValidBishopStep(x1, y1, x2, y2);
                break;
            case 4:
                result = Knight.isValidKnightStep(x1, y1, x2, y2);
                break;
            case 5:
                result = Rook.isValidRookStep(x1, y1, x2, y2);
                break;
            case 6:
                result = Pawn.isValidPawnStep(x1, y1, x2, y2);
                break;
        }
        return result;
    }
}

