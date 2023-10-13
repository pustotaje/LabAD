package Lab01;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
        String day = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input day number: ");
        int dm = in.nextInt();

        System.out.printf("Today is %s %s %d \n",day, month, dm);
        in.close();
    }
}
