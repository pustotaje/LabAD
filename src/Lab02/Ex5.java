package Lab02;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int th = (num / 1000) % 10;
        System.out.println("Количество тысяч: " + th);
    }
}