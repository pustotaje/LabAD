package Lab03;

import java.util.Random;

public class ex9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        // Заполнение массива случайными числами и отображение его
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100); // генерация случайного числа от 0 до 99
            System.out.print(array[i] + " ");
        }

        // Поиск элемента с минимальным значением и его индексов
        int min = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("\nМинимальное значение: " + min);
        System.out.print("Индексы с минимальным значением: ");
        for (int i = 0; i < 10; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
