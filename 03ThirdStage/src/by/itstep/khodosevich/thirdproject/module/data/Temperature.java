package by.itstep.khodosevich.thirdproject.module.data;

public class Temperature {
    public static double translateCelciesIntoFahrenheit(double celcies) {
        return 9/5.0*celcies+32;
    }

    public static double translateCelciesIntoKelvin(double celcies) {
        return celcies+273.15;
    }

    public static double translateKelvinIntoCelcies(double kelvin){
        return kelvin-273.15;
    }

    public static double translateKelvinIntoFahrenheit(double kelvin){
        return (kelvin-273.15)*9/5+32;
    }

    public static double translateFahrenheitIntoCelcies(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }

    public static double translateFahrenheitIntoKelvin(double fahrenheit){
        return (fahrenheit+459.67)*5/9;
    }


}
