package Lab01;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input patronymic: ");
        String patronymic = in.nextLine();

        System.out.printf("Hello %s %s %s", surname, name, patronymic);
        in.close();
    }
}
