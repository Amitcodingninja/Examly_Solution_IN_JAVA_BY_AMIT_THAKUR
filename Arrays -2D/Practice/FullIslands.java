// You are using Java

import java.util.*;

class fullIslands {
    public static void main(String[] args) {
        int i, j, n, s = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((i > 0) && (a[i - 1][j] == 1)) {
                    a[i][j] = 0;
                }
                if ((i < n - 1) && (a[i + 1][j] == 1)) {
                    a[i][j] = 0;
                }
                if ((j > 0) && (a[i][j - 1] == 1)) {
                    a[i][j] = 0;
                }
                if ((j < n - 1) && (a[i][j + 1] == 1)) {
                    a[i][j] = 0;
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}