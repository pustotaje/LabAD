package Lab02;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num >= 5 && num <= 10) {
            System.out.println("Число попадает в диапазон от 5 до 10");
        } else {
            System.out.println("Число не попадает в диапазон от 5 до 10");
        }
    }
}