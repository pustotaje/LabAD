package Lab01;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        int res = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Input: ");
        int inp = in.nextInt();

        int min = inp - 1;
        int odin = inp + 1;
        int kv = (inp + min + odin)*(inp + min + odin);

        System.out.printf("Result is %d,%d,%d,%d.\n",min,inp,odin,kv);
        in.close();
    }
}
