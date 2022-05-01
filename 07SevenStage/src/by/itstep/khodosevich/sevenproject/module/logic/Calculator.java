package by.itstep.khodosevich.sevenproject.module.logic;

public class Calculator {
    public static double calculate(char ch, double var1, double var2) {

        if (ch == '/' || ch == '%') {
            if (var2 == 0) {
                throw new RuntimeException();
            }
        }

        double result = var1 + var2;

        switch (ch) {
            case '+': {
                break;
            }
            case '-': {
                result = var1 - var2;
                break;
            }
            case '*': {
                result = var1 * var2;
                break;
            }
            case '/': {
                result = var1 / var2;
                break;
            }
            case '%': {
                result = var1 % var2;
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }

        return result;
    }
}
