package Lab03;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int count = scanner.nextInt();

        int firstNumber = 1;
        int secondNumber = 1;
        int i = 2;

        System.out.print("Последовательность чисел Фибоначчи: " + firstNumber + " " + secondNumber + " ");

        while (i < count) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            i++;
        }
    }
}
