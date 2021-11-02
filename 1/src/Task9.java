public class Task9 {
    public static short size = 9;
    public static String[][] strings;

    public static void main(String[] args) {
        strings = new String[size][size];

        for (int i = 0; i < size; i++) { // i - номер строки
            for (int j = 0; j < size; j++) { // j - номер столбца
                strings[i][j] = (char) ('A' + j) + String.valueOf(size - i); // по столбцам j меняется буква, по строкам i меняется число
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(String.join(" ", strings[i]));
        }
    }
}
