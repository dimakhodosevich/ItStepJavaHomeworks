package by.itstep.khodosevich.sevenproject.module.logic;

public class QuadraticEquation {
    public static String resolveQuadraticEquation(double a, double b, double c) {

        if (a == 0) {
            throw new RuntimeException();
        }

        double discriminant = b * b - 4 * a * c;
        double x1;
        double x2;
        String result = String.format("Discriminant<0 (D=%.2f). Equation doesn't has any root.",
                discriminant);

        if (discriminant > 0) {

            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result = String.format("Discriminant>0 (D=%.2f). Equation has two roots x1=%.2f; x2=%.2f.",
                    discriminant, x1, x2);

        } else if (discriminant == 0) {

            x1 = -b / 2 * a;
            result = String.format("Discriminant=0 (D=%.2f). Equation has one root x1=%.2f.",
                    discriminant, x1);

        }

        return result;
    }
}
