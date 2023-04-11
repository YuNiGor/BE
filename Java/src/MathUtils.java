public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}
    /*
    int sum = MathUtils.add(2, 3); // sum равен 5
    int difference = MathUtils.subtract(10, 5); // difference равен 5
    int product = MathUtils.multiply(4, 5); // product равен 20
    double quotient = MathUtils.divide(10.0, 2.5); // quotient равен 4.0
    //Метод divide проверяет, не является ли второй аргумент нулем. Если это так, то метод выбрасывает
    //исключение IllegalArgumentException.
     */
