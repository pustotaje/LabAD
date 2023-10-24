package Lab02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число?");
        int num = scanner.nextInt();

        if (num % 3 == 0){
            System.out.println("Число " + num + " делится на 3");}
        else {
            System.out.println("Число " + num + " не делится на 3");
        }

    }
}
