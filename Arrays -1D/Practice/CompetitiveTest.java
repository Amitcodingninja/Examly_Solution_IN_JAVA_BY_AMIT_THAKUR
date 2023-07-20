// You are using Java

import java.util.*;

class CompetitiveTest {
    public static void main(String[] args) {
        int n, i, j = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n - 1; i++) {
            if (a[i] <= a[i + 1]) {
                j++;
            } else {
                k = k + (j * (j + 1) / 2);
                j = 0;
            }
        }
        k = k + (j * (j + 1) / 2);
        System.out.println(k + n);
    }
}