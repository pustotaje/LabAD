package Lab01;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input age: ");
        int age = in.nextInt();

        System.out.printf("Your name is: %s, your age is: %d", name, age);
        in.close();
    }
}
