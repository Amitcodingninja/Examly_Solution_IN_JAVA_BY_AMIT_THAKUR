// You are using Java

import java.io.*;
import java.util.*;

class Friendshiptest {
    public static void main(String[] args) {
        int i, j = 0, k = 0, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (a[i] > 0) {
                j++;
                for (k = i + 1; k < n; k++) {
                    if (a[i] == a[k]) {
                        a[k] = 0;
                    }

                }
            }
        }
        System.out.println(j);
    }
}