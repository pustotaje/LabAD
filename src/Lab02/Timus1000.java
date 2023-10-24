package Lab02;


import java.util.Scanner;

public class Timus1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();

        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Результат: " + sum);
    }
}
