package Lab01;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        int res = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Input first: ");
        int first = in.nextInt();

        System.out.println("Input second: ");
        int second = in.nextInt();
        res = first + second;

        System.out.printf("Result is %d\n",res);
        in.close();
    }
}
