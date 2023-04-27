import java.util.Arrays;

public class ArrayManager {
    private final int[] array; // создаем массив array и делаем его константным
    private int size; // создаем переменную size, которая будет использоваться для хранения размера массива

    public ArrayManager() { // конструктор класса
        array = new int[10]; // создаем новый массив длины 10 и сохраняем его в array
        size = 0; // устанавливаем размер массива в 0
    }

    public void insert(int index, int value) { // метод для вставки значения в массив
        if (size == array.length) { // если размер массива равен длине массива, то...
            System.out.println("Array is full"); // выводим сообщение об ошибке
            return; // прерываем метод
        }
        if (index < 0 || index > size) { // если index меньше 0 или больше size, то...
            System.out.println("Invalid index"); // выводим сообщение об ошибке
            return; // прерываем метод
        }
        for (int i = size; i > index; i--) { // проходимся по массиву с конца до index, сдвигая каждый элемент на одну позицию вправо
            array[i] = array[i - 1];
        }
        array[index] = value; // сохраняем значение value в ячейку с индексом index
        size++; // увеличиваем размер массива на 1
    }

    public void delete(int index) { // метод для удаления элемента из массива
        if (index < 0 || index >= size) { // если index меньше 0 или больше или равен size, то...
            System.out.println("Invalid index"); // выводим сообщение об ошибке
            return; // прерываем метод
        }
        for (int i = index; i < size - 1; i++) { // проходимся по массиву от index до size - 1, сдвигая каждый элемент на одну позицию влево
            array[i] = array[i + 1];
        }
        array[size - 1] = 0; // сохраняем 0 в последнюю ячейку массива
        size--; // уменьшаем размер массива на 1
    }

    public void sort() { // метод для сортировки массива
        Arrays.sort(array, 0, size); // используем метод sort() из класса Arrays для сортировки массива от 0 до size
    }

    public int search(int value) { // метод для поиска значения в массиве
        for (int i = 0; i < size; i++) { // проходимся по массиву от начала до size
            if (array[i] == value) { // если элемент массива равен искомому значению, то...
                return i; // возвращаем индекс этого элемента
            }
        }
        return -1; // если значение не найдено, то возвращаем -1
    }

    public String toString() { // объявление метода toString(), который возвращает строковое представление объекта
        StringBuilder sb = new StringBuilder(); // создание объекта StringBuilder для формирования строки
        for (int i = 0; i < size; i++) { // начало цикла, который будет перебирать элементы массива
            sb.append(array[i]); // добавление очередного элемента массива в объект StringBuilder
            if (i != size - 1) { // если не достигнут последний элемент массива, то...
                sb.append(", "); // добавляем в объект StringBuilder запятую и пробел
            }
        }
        return sb.toString(); // возвращение объекта StringBuilder в виде строки
    }
}