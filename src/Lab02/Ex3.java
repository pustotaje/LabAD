package Lab02;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num % 4 == 0 && num >= 10) {
            System.out.println("Введенное число удовлетворяет критериям.");
        }
        else {
            System.out.println("Введенное число не удовлетворяет критериям.");
        }
    }
}
