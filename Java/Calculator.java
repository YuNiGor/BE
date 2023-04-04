import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();
        System.out.println("Введите операцию (+, -, *, /, sqrt, pow):");
        String operator = scanner.next();

        if (operator.equals("+")) {
            double result = add(num1, num2);
            System.out.println("Результат: " + result);
        } else if (operator.equals("-")) {
            double result = subtract(num1, num2);
            System.out.println("Результат: " + result);
        } else if (operator.equals("*")) {
            double result = multiply(num1, num2);
            System.out.println("Результат: " + result);
        } else if (operator.equals("/")) {
            double result = divide(num1, num2);
            System.out.println("Результат: " + result);
        } else if (operator.equals("sqrt")) {
            double result = sqrt(num1);
            System.out.println("Результат: " + result);
        } else if (operator.equals("pow")) {
            double result = pow(num1, num2);
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Неверная операция!");
        }

        scanner.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double sqrt(double num) {
        return Math.sqrt(num);
    }

    public static double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
