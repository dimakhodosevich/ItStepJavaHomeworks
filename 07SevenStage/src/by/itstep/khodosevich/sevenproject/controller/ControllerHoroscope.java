package by.itstep.khodosevich.sevenproject.controller;

import by.itstep.khodosevich.sevenproject.view.Printer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static by.itstep.khodosevich.sevenproject.module.logic.Horoscope.*;

public class ControllerHoroscope {


    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input date of your birthday in format (07.02.2022):");
        String dateString = scanner.next();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = simpleDateFormat.parse(dateString);

        int day = date.getDate();
        int month = date.getMonth()+1;
        int year = date.getYear()+1900;

        String result = String.format("You are %s.", checkHoroscope(day, month, year));
        Printer.printToConsole(result);

        scanner.close();
    }
}
