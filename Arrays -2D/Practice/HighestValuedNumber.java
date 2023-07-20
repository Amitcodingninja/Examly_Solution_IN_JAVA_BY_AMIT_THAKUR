// You are using Java

import java.util.Scanner;

class HighestValuedNumber {
    public static void main(String[] args) {
        int i, j, n, k = -1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] a = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] < 11 && a[i][j] > k) {
                    k = a[i][j];
                }
            }
        }
        System.out.println(k);
    }
}