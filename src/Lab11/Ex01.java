package Lab11;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01 {
    public static void main(String[] args) {
        int[] array = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] evenNumbers = filterEvenNumbers(array);
        System.out.println("Четные числа из исходного массива: " + Arrays.toString(evenNumbers));
    }

    public static int[] filterEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .toArray();
    }
}