import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести имя");
        String name = scanner.next();

        boolean isCorrectPassword = false;
        while (!isCorrectPassword) {
            System.out.println("Ввести пароль");
            String pass = scanner.next();

            if (pass.length()>=8 && pass.length()<=15) {
                System.out.printf("Логин %s создан с паролем %s", name, pass);
                isCorrectPassword = true;
            } else System.out.println("Введите пароль более 8 и менее 15 символов");
        }
    }
}
