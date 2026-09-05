package pyq;
// //### Question 4

import java.util.Scanner;

// You are standing at the top-left corner of an **m × n grid**. You want to reach the bottom-right corner by moving only **down or right** at any point in time.

// **How many unique paths are there to reach the destination?**

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        // System.out.println(findUnique(m, n));
        System.out.println(findUniqueDP(m, n, dp));
        sc.close();
    }

    private static int findUnique(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        return findUnique(m - 1, n) + findUnique(m, n - 1);

    }

    private static int findUniqueDP(int m, int n, int[][] dp) {
        if (m == 1 || n == 1)
            return 1;
        if (dp[m][n] != -1)
            return dp[m][n];
        int right = findUniqueDP(m - 1, n, dp);
        int down = findUniqueDP(m, n - 1, dp);
        return dp[m][n] = right + down;
    }
}
