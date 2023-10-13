package Lab01;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input current year: ");
        int currentyear = in.nextInt();

        System.out.println("Input your birth year: ");
        int birthyear = in.nextInt();
        int res = currentyear - birthyear;

        System.out.printf("Your age is %d",res);
        in.close();
    }
}
