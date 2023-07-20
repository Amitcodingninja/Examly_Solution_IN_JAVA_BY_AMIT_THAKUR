// You are using Java

import java.util.Scanner;

class NumberOfWhiteCells {
    public static void main(String[] args) {
        int i, j, n, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] a = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] <= 10) {
                    count += a[i][j];
                }

            }
        }

        System.out.println(count);
    }
}