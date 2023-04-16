import java.util.Scanner;
public class Main {

    static int globalInt;

    public static void main(String[] args) {

        // Использование цикла for
        /**
         *    Самый компактный из трех циклов, особенно если нужно выполнить итерацию определенное количество раз.
         *     Используется, когда заранее известно, сколько раз нужно выполнить итерацию.
         *     Удобен, когда нужно пройти по элементам массива или коллекции.
         */
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Использование цикла while
        /**
         *     Используется, когда количество итераций неизвестно или зависит от условия.
         *     Позволяет лучше контролировать условие продолжения цикла.
         *     Удобен, когда условие продолжения цикла может измениться внутри цикла.
         */
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }

        // Использование цикла do-while
        /**
         *     Гарантирует, что блок кода внутри цикла будет выполнен хотя бы один раз.
         *     Используется, когда нужно выполнить определенный блок кода, прежде чем проверять условие продолжения цикла.
         *     Может быть полезен в ситуациях, когда вы не знаете заранее, сколько раз нужно выполнить итерацию.
         */
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while(j <= 10);


    //Сделать логический метод, который проверяет на равенство два числа.
        int a = 5;
        int b = 10;
        boolean result = areEqual(a, b);
        System.out.println("Числа " + a + " и " + b + " равны: " + result);

    //Сделать процедуру для чтения с консоли значения в глобальную переменную.
        readGlobalIntFromConsole();
        System.out.println("Вы ввели число: " + globalInt);

    //Сделать класс Cat с полями: age, weight и name. Добавить конструктор для инициализации полей,
    // сделать методы асессоры и метод out для вывода на консоль всех значений объекта.
    //Создать объект класса Cat и показать работу всех его методов.
        Cat myCat = new Cat(3, 5.5, "Barsik");

        myCat.out();

        System.out.println("Имя: " + myCat.getName());
        System.out.println("Возраст: " + myCat.getAge());
        System.out.println("Вес: " + myCat.getWeight());

        myCat.setName("Murzik");
        myCat.setAge(4);
        myCat.setWeight(4.5);

        myCat.out();
    }

    static void readGlobalIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        globalInt = scanner.nextInt();

    }

    public static boolean areEqual(int a, int b) {
        boolean result = a == b;
        return result;
    }
}