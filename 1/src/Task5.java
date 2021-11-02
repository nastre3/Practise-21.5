import java.util.Arrays;

public class Task5 {
    public static int[] numbers = new int[100];
    public static void main(String[] args) {
        numbers[0] = 1;

        for (int i = 0, stop = numbers.length; i < stop; i++) {
            numbers[i] = (int) (Math.pow(-1, i) * (numbers[i] + i));
        }
        System.out.println(Arrays.toString(numbers));

    }
}
