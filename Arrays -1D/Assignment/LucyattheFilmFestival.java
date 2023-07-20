// You are using Java

import java.util.*;

class FlimFestival {
    public static void main(String[] args) {
        int i, j, k = 0, l = 0, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            a[i] = a[i] * b[i];
        }
        j = a[0];
        for (i = 1; i < n; i++) {
            if (j < a[i]) {
                j = a[i];
                k = b[i];
            }
        }
        for (i = n - 1; i >= 0; i--) {
            if ((j == a[i]) && (b[i] >= k)) {
                k = b[i];
                l = i + 1;
            }
        }
        System.out.println(l);
    }
}
