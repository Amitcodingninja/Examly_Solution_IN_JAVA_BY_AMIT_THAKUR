// You are using Java

import java.util.*;

class MidAged {
    public static void main(String[] args) {
        int i, j, n, count = 0;
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
                if (i == j) {
                    if (a[i][j] >= 18 && a[i][j] <= 60) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}