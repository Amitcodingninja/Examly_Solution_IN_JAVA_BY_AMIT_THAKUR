// You are using Java

import java.io.*;
import java.util.*;

class CountWays {
    public static int count(int x, int n, int num, int[][] memo) {
        if (x == 0) {
            return 1;
        }
        if (x < 0 || num > x) {
            return 0;
        }
        if (memo[x][num] != -1) {
            return memo[x][num];
        }
        int ways = count(x - (int) Math.pow(num, n), n, num + 1, memo)
                + count(x, n, num + 1, memo);
        memo[x][num] = ways;
        return ways;

    }

    public static int numberofWays(int x, int n) {
        int[][] memo = new int[x + 1][x + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return count(x, n, 1, memo);
    }

    public static void main(String[] args) {
        int x, n;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        n = sc.nextInt();

        System.out.println(numberofWays(x, n));
    }
}