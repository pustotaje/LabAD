package Lab02;

import java.util.Scanner;
import java.util.Arrays;

public class Timus1025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        int[] groups = new int[K];

        for (int i = 0; i < K; i++) {
            groups[i] = input.nextInt();
        }

        Arrays.sort(groups);

        int totalSupporters = 0;
        int halfK = (K + 1) / 2;

        for (int i = 0; i < halfK; i++) {
            totalSupporters += (groups[i] + 1) / 2;
        }

        System.out.println(totalSupporters);

        input.close();
    }
}