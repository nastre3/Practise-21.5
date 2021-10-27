import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        //Создаем массив
        int[] array = {22, 4, 5, 6};
//Создаем копию
        int[] copy = Arrays.copyOf(array, array.length);

        //Создаем массив
        int[] array2 = {22, 4, 5, 6};
//Создаем копию, в отведенных рамках
        int[] copy2 = Arrays.copyOfRange(array2, 1, 3);
//copy будет равен {4, 5}.

        //Создаем массив
        int[] array3 = {22, 4, 5, 6};
//Выводим массив в консоль
        System.out.println(Arrays.toString(array3));
//Будет напечатана строка: [22, 4, 5, 6]


//Создаем массив
        int[] array4 = {22, 4, 5, 6};
//Сортируем его
        Arrays.sort(array4);
//Будет: [4, 5, 6, 22]

        //Создаем массив
        int[] array5 = {4, 5, 6, 22};
//Ищем элемент и печатаем его индекс в консоль
        System.out.println(Arrays.binarySearch(array5, 4));
//Будет напечатано 1.

        //Создаем массив
        int[] array6 = new int[10];
//Заполняем все ячейки массива цифрой 15
        Arrays.fill(array6, 15);

        //Создаем массив 1
        int[] array7 = {1, 2, 4, 56};
//Создаем массив 2
        int[] array8 = {1, 762, 44, 5};
//Сравниваем массивы
        Arrays.equals(array7, array8);
//Массивы не равны, метод вернёт false
    }
}
