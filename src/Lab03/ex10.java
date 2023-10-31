package Lab03;

import java.util.Arrays;
import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        // Заполнение массива случайными числами
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100); // генерация случайного числа от 0 до 99
        }

        // Сортировка массива в порядке убывания
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Отображение отсортированного массива
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
