1) Создать по переменной каждого типа и присвоить ей значение
2) Вывести все переменные в консоль
3) Вывести все переменные в одну линию с пробелом в консоль


public class Main {
    public static void main(String[] args) {
        int Int = 42;
        double Double = 3.14;
        boolean Boolean = true;
        char Char = 'A';
        String String = "Hello, World!";

        System.out.println(Int);
        System.out.println(Double);
        System.out.println(Boolean);
        System.out.println(Char);
        System.out.println(String);

        System.out.println(Int + " " + Double + " " + Boolean + " " + Char + " " + String);
    }
}


Дз (дополнительное) 
1) Показать явное и неявное приведение типа 
2) Создать строку, прибавить к ней другую строку 
3) Показать работу метод toUpperCase, toLowerCase, substring, charAt, reverse для строки


public class Main {
    public static void main(String[] args) {

        double d = 3.141592653589793;
        int i = (int) d;
        System.out.println("d = " + d);
        System.out.println("i = " + i);

        int j = 42;
        double k = j;
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        String str4 = "AbCdEfGhIjKlMnOpQrStUvWxYz";
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toLowerCase());
        System.out.println(str4.substring(2, 10));
        System.out.println(str4.charAt(12));
        System.out.println(new StringBuilder(str4).reverse());
    }
}


//Задача Сделать распиание: Дисциплина, продолжительность занятия, преподаватель  и стоимость

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Дисциплина: ");
        String lesson = sc.next();
        System.out.println("Продолжительность занятия: ");
        float duration = sc.nextFloat();
        System.out.println("Преподаватель: ");
        String teacher = sc.next();
        System.out.println("Стоимость: ");
        int cost = sc.nextInt();

        System.out.println("+------------+-------------------+---------------+------------+");
        System.out.println("| Дисциплина | Продолжительность | Преподаватель |  Стоимость |");
        System.out.println("+------------+-------------------+---------------+------------+");
        System.out.printf("| %-10s | %17.2f | %-14s| %10d |\n", lesson, duration, teacher, cost);
        System.out.println("+------------+-------------------+---------------+------------+");
    }
}


Дз в Скиллдеск
1. Создать декларировать все примитивные типы как глобальные переменные и как локальные переменные
2. Считать из консоли каждый примитивный тип и присвоить его переменной.
3. Вывести все типы в таблицу при помощи println() b printf()

import java.util.Scanner;

public class Main {
    
    static boolean globalBoolean;
    static byte globalByte;
    static short globalShort;
    static int globalInt;
    static long globalLong;
    static float globalFloat;
    static double globalDouble;
    static char globalChar;

    public static void main(String[] args) {
        
        boolean localBoolean;
        byte localByte;
        short localShort;
        int localInt;
        long localLong;
        float localFloat;
        double localDouble;
        char localChar;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boolean value: ");
        localBoolean = scanner.nextBoolean();
        System.out.print("Enter a byte value: ");
        localByte = scanner.nextByte();
        System.out.print("Enter a short value: ");
        localShort = scanner.nextShort();
        System.out.print("Enter an int value: ");
        localInt = scanner.nextInt();
        System.out.print("Enter a long value: ");
        localLong = scanner.nextLong();
        System.out.print("Enter a float value: ");
        localFloat = scanner.nextFloat();
        System.out.print("Enter a double value: ");
        localDouble = scanner.nextDouble();
        System.out.print("Enter a char value: ");
        localChar = scanner.next().charAt(0);
        
        System.out.println("+---------------+---------------+");
        System.out.println("|   Data Type   |     Value     |");
        System.out.println("+---------------+---------------+");
        System.out.printf("| boolean       | %-13s |\n", localBoolean);
        System.out.printf("| byte          | %-13d |\n", localByte);
        System.out.printf("| short         | %-13d |\n", localShort);
        System.out.printf("| int           | %-13d |\n", localInt);
        System.out.printf("| long          | %-13d |\n", localLong);
        System.out.printf("| float         | %-13f |\n", localFloat);
        System.out.printf("| double        | %-13f |\n", localDouble);
        System.out.printf("| char          | %-13s |\n", localChar);
        System.out.println("+---------------+---------------+");
    }
}


