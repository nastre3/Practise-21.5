public class StringMethods {
    public static void main(String[] args) {
        // 21.2.1
        System.out.println("Sometimes".charAt(2));

        "Some".charAt(0); // вернёт "S"

        "Hi".concat(" world!");

        String s1 = "some";
        String s2 = "Some";
        s1.equals("some"); // вернёт true
        s2.equals("some"); // вернёт false

        s1.equalsIgnoreCase("some"); // вернёт true

        "Some string".indexOf('o'); // вернёт 1

        "Some string".indexOf("string"); // вернёт 5

        "Some".length(); // вернёт 4

        "abra cadabra".replace('a', 'e'); // вернёт "ebre cedebre"

        "abra cadabra".replaceAll("abra", "no"); // вернёт "no cadno"

        "abra cadabra".replaceFirst("abra", "no"); // вернёт "no cadabra"

        "Маша,Саша,Витя".split(","); // вернёт массив имён {"Маша", "Саша", "Витя"}

        "Привет мир".substring(7); // вернёт "мир"
        "Привет мир".substring(0, 6); // вернёт "Привет

        "Привет мир".toLowerCase(); // вернёт "привет мир"
        "Привет мир".toUpperCase(); // вернёт "ПРИВЕТ МИР"

        " лишние пробелы ".trim(); //вернёт "лишние пробелы"

        String str = String.valueOf(3); // теперь строка str = "3"

    }
}
