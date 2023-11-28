package Lab06;

import java.util.Arrays;

public class ex06t {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int count1 = 3;
        int count2 = 7;

        int[] result1 = ex06.takeFirstElements(originalArray, count1);
        int[] result2 = ex06.takeFirstElements(originalArray, count2);

        System.out.println("Результат 1: " + Arrays.toString(result1));
        System.out.println("Результат 2: " + Arrays.toString(result2));
    }
}
