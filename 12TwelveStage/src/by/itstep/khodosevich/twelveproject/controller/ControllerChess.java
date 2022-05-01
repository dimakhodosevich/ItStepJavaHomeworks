package by.itstep.khodosevich.twelveproject.controller;

import by.itstep.khodosevich.twelveproject.module.logic.ChessBoard;
import by.itstep.khodosevich.twelveproject.module.logic.Figure;
import by.itstep.khodosevich.twelveproject.view.Printer;

import java.util.Scanner;

public class ControllerChess {
    public static void main(String[] args) {
        Printer.print("Input type of figure you want to move:");
        Printer.print("\n1 - King;");
        Printer.print("\n2 - Queen;");
        Printer.print("\n3 - Bishop;");
        Printer.print("\n4 - Knight;");
        Printer.print("\n5 - Rook;");
        Printer.print("\n6 - Pawn.");
        Printer.print("\nYour number: ");

        Scanner scanner = new Scanner(System.in);
        int typeOfFigure = scanner.nextInt();
        String figure = Figure.getFigure(typeOfFigure);
        String message = String.format("\nYou choose: %s\n", figure);
        Printer.print(message);

        Printer.print("Input point coordinate where your figure is standing " +
                "(chessboard has size 8x8): ");
        Printer.print("\nx = ");
        int x1 = scanner.nextInt();
        Printer.print("y = ");
        int y1 = scanner.nextInt();

        if (!ChessBoard.isChessBoardCell(x1, y1)) {
            Printer.print("Incorrect input!!!");
            return;
        }

        Printer.print("Input point coordinate where you want to mowe your figure");
        Printer.print("\nx = ");
        int x2 = scanner.nextInt();
        Printer.print("y = ");
        int y2 = scanner.nextInt();

        if (!ChessBoard.isChessBoardCell(x2, y2)) {
            Printer.print("Incorrect input!!!");
            return;
        } else {
            message = Figure.moveChessFigure(x1, y1, x2, y2, typeOfFigure);
            message = String.format("\nIs valid step? Answer: %s.", message);
            Printer.print(message);
        }

    }
}
