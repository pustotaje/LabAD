package Lab02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num % 5 == 2 && num % 7 == 1) {
            System.out.println("Число удовлеторяет условию.");
        } else {
            System.out.println("Число не удовлетворяет условию");
        }

    }
}