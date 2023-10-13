package Lab01;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first: ");
        int first = in.nextInt();

        System.out.println("Input second: ");
        int second = in.nextInt();

        int res = first + second;
        int res2 = first - second;

        System.out.printf("Summ is %d, subtraction is %d",res, res2);
        in.close();
    }
}
