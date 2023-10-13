package Lab01;

import java.util.Scanner;

public class Example09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type month: ");
        String month = in.nextLine();

        System.out.println("Type amount days in Month: ");
        int daysamount = in.nextInt();

        System.out.printf("In %s %d days\n",month, daysamount);
        in.close();
    }
}
