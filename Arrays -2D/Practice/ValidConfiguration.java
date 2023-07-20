// You are using Java

import java.io.*;
import java.util.*;

class validConfiguration {
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
                if (a[i][j] == 1) {
                    if ((i > 0) && (a[i - 1][j] != 0)) {
                        s = 0;
                        break;
                    }
                    if ((i < n - 1) && (a[i + 1][j] != 0)) {
                        s = 0;
                        break;
                    }
                    if ((j < n - 1) && (a[i][j + 1] != 0)) {
                        s = 0;
                        break;
                    }
                    if ((j > 0) && (a[i][j - 1] != 0)) {
                        s = 0;
                        break;
                    }
                }
                if ((a[i][j] > 0) && (a[i][j] < 11)) {
                    if ((i < n - 2) && (a[i + 2][j] < 11) && (a[i + 2][j] > 0)) {
                        if (a[i + 1][j] != 0) {
                            s = 0;
                            break;
                        }
                    }
                    if ((j < n - 2) && (a[i][j + 2] < 11) && (a[i][j + 2] > 0)) {
                        if (a[i][j + 1] != 0) {
                            s = 0;
                            break;
                        }
                    }
                    if ((i > 0) && (j > 0) && (a[i - 1][j - 1] < 11) && (a[i - 1][j - 1] > 0)) {
                        if ((a[i - 1][j] != 0) || (a[i][j - 1] != 0)) {
                            s = 0;
                            break;
                        }
                    }
                    if ((i < n - 1) && (j > 0) && (a[i + 1][j - 1] < 11) && (a[i + 1][j - 1] > 0)) {
                        if ((a[i + 1][j] != 0) || (a[i][j - 1] != 0)) {
                            s = 0;
                            break;
                        }
                    }
                }
            }
            if (s == 0) {
                break;

            }
        }
        if (s == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}