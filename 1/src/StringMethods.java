import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        // 21.2.1
        System.out.println("Sometimes".charAt(2));

        // 21.2.2
        System.out.println("Иван Иванов".equals("иван иванов"));

        // 21.2.3
        System.out.println("Иван Иванов".equalsIgnoreCase("иван иванов"));

        // 21.2.4
        String name1 = "Иван Иванов";
        String name2 = "иван иванов";
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Выберите другое имя пользователя");
        } else System.out.println("Отличное имя!");

        // 21.2.5
        checkUserName("Felix", "Anastasia Andreevna Tkacheva");

        // 21.2.8.1
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));

        // 21.2.8.2
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }

        // Хранение строк
        String a = "22";
        String b = "22"; // при создании идентичной строки новая строка не создается, а берется из памяти уже созданная и в переменную присваивается ссылка на созданную переменную из памяти для строк
        String с = "22" + a; // при конкатенации строк создается новая строка
        // хэш совпадает для строк
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        // хэш не совпадает для объектов
        StringMethods main = new StringMethods();
        StringMethods main2 = new StringMethods();
        System.out.println(main.hashCode());
        System.out.println(main2.hashCode());

        // создание ссылки на объект
        StringMethods main3 = main;
        System.out.println(main3.hashCode());

        // Форматирование строк
        String name = "Nastya";
        int age = 18;
        String job = "QA";
        String formatString = String.format("Привет, меня зовут %s, мне %d лет и я работаю %s", name, age, job);
        System.out.println(formatString);
        System.out.printf("Привет еще раз, меня зовут %s, мне %d лет и я работаю %s", name, age, job);


        "Some".

                charAt(0); // вернёт "S"

        "Hi".

                concat(" world!");

        String s1 = "some";
        String s2 = "Some";
        s1.equals("some"); // вернёт true
        s2.equals("some"); // вернёт false

        s1.equalsIgnoreCase("some"); // вернёт true

        "Some string".

                indexOf('o'); // вернёт 1

        "Some string".

                indexOf("string"); // вернёт 5

        "Some".

                length(); // вернёт 4

        "abra cadabra".

                replace('a', 'e'); // вернёт "ebre cedebre"

        "abra cadabra".

                replaceAll("abra", "no"); // вернёт "no cadno"

        "abra cadabra".

                replaceFirst("abra", "no"); // вернёт "no cadabra"

        "Маша,Саша,Витя".

                split(","); // вернёт массив имён {"Маша", "Саша", "Витя"}

        "Привет мир".

                substring(7); // вернёт "мир"
        "Привет мир".

                substring(0, 6); // вернёт "Привет

        "Привет мир".

                toLowerCase(); // вернёт "привет мир"
        "Привет мир".

                toUpperCase(); // вернёт "ПРИВЕТ МИР"

        " лишние пробелы ".

                trim();

        String str = String.valueOf(3); // теперь строка str = "3"

    }

    private static boolean checkName(String name) {
        int i = 0;
        String[] newS = name.split(" ");
        while (i < newS.length) {
            i++;
        }
        if (i == 3) {
            return true;
        } else return false;
    }

    private static String removeWhiteSpaces(String s) {
        return s.replaceAll(" ", "");
    }

    private static void checkUserName(String name1, String name2) {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя!");
            // 21.2.6
            System.out.println("Ваше имя имеет длину " + name2.length() + " символов");

            System.out.println("А без пробелов ваше имя занимает " + sum(name2) + " символов");
            // 21.2.7 (2nd version)
            String name2copy = name2.replace(" ", "");
            System.out.println("А без пробелов ваше имя занимает " + name2copy.length() + " символов");
        }
    }

    private static int sum(String name2) {
        // 21.2.7
        int sum = 0;
        String[] newS = name2.split(" ");
        for (int i = 0; i < newS.length; i++) {

            sum += newS[i].length();

        }
        return sum;
    }
}
