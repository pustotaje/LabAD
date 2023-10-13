package Lab01;

import java.util.Calendar;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input your birth year: ");
        int birthyear = in.nextInt();
        int res = year - birthyear;

        System.out.printf("Your name is %s and age is %d\n", name, res);
        in.close();
    }
}
