package Lab03;

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int secondNumber = scanner.nextInt();

        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);

        System.out.println("Целые числа в диапазоне от " + start + " до " + end + ":");

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
