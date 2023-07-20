// You are using Java

import java.util.*;

class libraryTimeTable {
    public static void main(String[] args) {
        int i, n, j = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if ((a[i] - j) >= b[i]) {
                k++;
            }
            j = a[i];
        }
        System.out.println(k);
    }
}
