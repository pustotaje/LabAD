package Lab02;

import java.util.Arrays;
import java.util.Scanner;

public class Timus1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество камней: ");
        int n = scanner.nextInt();

        int[] weights = new int[n];

        System.out.println("Введите значения весов камней через пробел:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        int minDifference = findMinDifference(weights);

        System.out.println(minDifference);
    }

    public static int findMinDifference(int[] weights) {
        int totalSum = Arrays.stream(weights).sum();
        int halfSum = totalSum / 2;

        int[][] dp = new int[weights.length + 1][halfSum + 1];

        for (int i = 1; i <= weights.length; i++) {
            for (int j = 1; j <= halfSum; j++) {
                if (weights[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], weights[i - 1] + dp[i - 1][j - weights[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int minDifference = totalSum - 2 * dp[weights.length][halfSum];
        return minDifference;
    }
}
