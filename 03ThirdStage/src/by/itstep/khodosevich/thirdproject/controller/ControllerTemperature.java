package by.itstep.khodosevich.thirdproject.controller;

import by.itstep.khodosevich.thirdproject.module.data.Temperature;
import by.itstep.khodosevich.thirdproject.view.Printer;

import java.util.Scanner;

public class ControllerTemperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input value of temperature you want to translate:");
        double temperature = scanner.nextDouble();

        System.out.printf("Input which translater you want use:\n");
        System.out.printf("1 - Celcies into fahrenheit;\n");
        System.out.printf("2 - Celcies into kelvin;\n");
        System.out.printf("3 - Kelvin into celcies;\n");
        System.out.printf("4 - Kelvin into fahrenheit;\n");
        System.out.printf("5 - Fahrenheit into celcies;\n");
        System.out.printf("6 - Fahrenheit into kelvin.\n\n");
        int choose = scanner.nextInt();

        String result = "No such case in menu!!!";

        switch (choose) {
            case 1:
                result = String.format("%.2f degree of celcies = %.2f degree of fahrenheit", temperature,
                        Temperature.translateCelciesIntoFahrenheit(temperature));
                break;
            case 2:
                result = String.format("%.2f degree of celcies = %.2f degree of kelvin", temperature,
                        Temperature.translateCelciesIntoKelvin(temperature));
                break;
            case 3:
                result = String.format("%.2f degree of kelvin = %.2f degree of celcies", temperature,
                        Temperature.translateKelvinIntoCelcies(temperature));
                break;
            case 4:
                result = String.format("%.2f degree of kelvin = %.2f degree of fahrenheit", temperature,
                        Temperature.translateKelvinIntoFahrenheit(temperature));
                break;
            case 5:
                result = String.format("%.2f degree of fahrenheit = %.2f degree of celcies", temperature,
                        Temperature.translateFahrenheitIntoCelcies(temperature));
                break;
            case 6:
                result = String.format("%.2f degree of fahrenheit = %.2f degree of kelvin", temperature,
                        Temperature.translateFahrenheitIntoKelvin(temperature));
                break;
        }

        Printer.printToConsole(result);
    }
}
