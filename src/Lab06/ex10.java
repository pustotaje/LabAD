package Lab06;

import java.util.Arrays;

public class ex10 {
    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No arguments provided");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] numbers = {7, 3, 9, 1, 5};
        int[] result = findMinMax(numbers);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Min: " + result[0]);
        System.out.println("Max: " + result[1]);
    }
}
