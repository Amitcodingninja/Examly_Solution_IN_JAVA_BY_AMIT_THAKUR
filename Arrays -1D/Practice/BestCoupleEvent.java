// You are using Java

import java.util.*;

class Couple {
    public static void main(String[] args) {
        int n, i, j, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] > 0) {
                k = a[i];
                for (j = i + 1; j < n; j++) {
                    if (k == a[j]) {
                        a[j] = 0;
                        break;
                    }
                    if (j == n - 1) {
                        n = 0;
                        break;
                    }
                }
            }
            if (n == 0) {
                break;
            }
        }
        System.out.println(k);
    }
}