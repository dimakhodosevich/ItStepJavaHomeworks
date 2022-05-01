package by.itstep.khodosevich.nineproject.task02.controller;

import by.itstep.khodosevich.nineproject.task01.view.Printer;

import java.io.IOException;
import java.util.Scanner;

import static by.itstep.khodosevich.nineproject.task02.module.logic.CakeMachine.*;

public class ControllerCakeMachine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        char symbol;

        while (true){
            Printer.print("This is cake machine with surprise, push SPACE for generate our present:");
            symbol = (char)System.in.read();

            if(symbol==(char)32){
                break;
            }

            while(symbol!='\n'){
                symbol = (char)System.in.read();
            }
        }

//        не работает
//        do {
//            Printer.print("This is cake machine with surprise, push SPACE for generate our present:");
//            String msg = scanner.next();
//            symbol = msg.charAt(0);
//
//        } while (symbol != (char) 32);

        String msg = getCakeWithSurprise();

        Printer.print(msg);
        scanner.close();

    }
}
