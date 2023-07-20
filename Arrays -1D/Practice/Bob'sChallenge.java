// You are using Java

import java.io.*;
import java.util.*;

class BobsChallenge {
    public static int zerofun(int a[], int n) {
        int i, j, k = 2;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    k--;
                }
                if (k == 0) {
                    break;
                }
                if (j == n - 1) {
                    a[i] = 0;
                }
            }
            k = 2;
        }
        k = a[0];
        for (i = 0; i < n; i++) {
            if (a[i] > k) {
                k = a[i];
            }
        }
        j = 0;
        for (i = 0; j < 2; i++) {
            if (k == a[i]) {
                a[i] = 0;
                j++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int n, i, k = 2, l = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        k = zerofun(a, n);
        l = zerofun(a, n);
        if (l * k == 0) {
            System.out.println("-1");
        } else {
            System.out.println(l * k);
        }
    }
}
