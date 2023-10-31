package Lab03;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел для суммирования: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;

        System.out.println("Числа, которые суммируются:");

        while (n > 0) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum += i;
                n--;
            }
            i++;
        }

        System.out.println("Сумма чисел: " + sum);
    }
}
