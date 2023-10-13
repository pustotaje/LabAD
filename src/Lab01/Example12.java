package Lab01;

import java.util.Calendar;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();
        int res = year - age;

        System.out.printf("Your birth year is %d", res);
        in.close();
    }
}
