package Lab06;

import java.util.Arrays;

public class ex09 {
    public static void swapPairs(char[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("original: " + Arrays.toString(characters));

        swapPairs(characters);

        System.out.println("swap: " + Arrays.toString(characters));
    }
}
