public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        car1.out(); // Выводит на консоль: Make: Toyota Model: Camry Year: 2020

        Car car2 = new Car();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setYear(2018);
        car2.out(); // Выводит на консоль: Make: Honda Model: Civic Year: 2018

        int a = 11;
        int b = 15;
        int c = 10;
        System.out.println(isFirstVariableGreaterThanOthers(a, b, c));
        System.out.println(isFirstVariableGreaterThanAtLeastOne(a, b, c));
        System.out.println(isFirstVariableGreaterThanOnlyOne(a, b, c));
    }

    public static boolean isFirstVariableGreaterThanOthers(int a, int b, int c) {
        return a > b && a > c;
    }

    public static boolean isFirstVariableGreaterThanAtLeastOne(int a, int b, int c) {
        return a > b || a > c;
    }

    public static boolean isFirstVariableGreaterThanOnlyOne(int a, int b, int c) {
        return (a > b && a <= c) || (a > c && a <= b);
    }
}
