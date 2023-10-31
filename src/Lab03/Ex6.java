package Lab03;

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = 0;

        try {
            size = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка: Введите корректное целое число.");
            return;
        }

        if (size <= 0) {
            System.out.println("Ошибка: Размер массива должен быть положительным числом.");
            return;
        }

        int[] array = new int[size];
        int num = 2;

        for (int i = 0; i < size; ) {
            if (num % 5 == 2) {
                array[i] = num;
                i++;
            }
            num++;
        }

        System.out.println("Массив чисел, при делении на 5 дающих в остатке 2:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
