public class Main {
    public static void main(String[] args) {
        ArrayManager am = new ArrayManager(); // присваиваем ArrayManager переменной am
        am.insert(0, 5); // вставляем элемент со значением 5 на позицию 0 в массив array в объекте am
        am.insert(1, 3); // вставляем элемент со значением 3 на позицию 1 в массив array в объекте am
        am.insert(1, 4); // вставляем элемент со значением 4 на позицию 1 в массив array в объекте am
        System.out.println(am); // выводим содержимое массива в объекте am в виде строки на консоль
        am.delete(1); //  удаляем элемент на позиции 1 в массиве array в объекте am
        System.out.println(am); // выводим содержимое массива в объекте am в виде строки на консоль
        am.sort(); // сортируем элементы в массиве array в объекте am
        System.out.println(am); // выводим содержимое массива в объекте am в виде строки на консоль
        int index = am.search(5); // ищем элемент со значением 5 в массиве array в объекте am и сохраняем его индекс в переменной index
        System.out.println(index); // выводим значение переменной  index на консоль
    }

}