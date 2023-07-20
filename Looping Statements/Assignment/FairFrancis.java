// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i, j = 0, k, l, m = 0;
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            j = j + a[i];
        }
        k = j / n;
        l = j - (k * n);
        for (i = 0; i < n; i++) {
            if (a[i] < k) {
                a[i] = 0;
            } else {
                a[i] = a[i] - k;
            }
            m = m + a[i];
        }
        m = m - l;
        System.out.println(l + " " + m);
    }
}