// You are using Java

import java.io.*;
import java.util.*;

class Tiles {
    static int count, s, m1;

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(minimumTiles(n, m));
    }

    private static int minimumTiles(int n, int m) {
        int i = 1, j = 1;
        if (s == 0) {
            m1 = m;
            s++;
        }
        while (i <= n) {
            i = i * 2;
        }
        i = i / 2;
        while (j <= m) {
            j = j * 2;
        }
        j = j / 2;
        if (n == 0) {
            return count;
        } else if (m == 0) {
            minimumTiles(n - i, m1);
        } else {
            if (i > j) {
                count = count + (i / j);
            } else {
                count = count + (j / i);
            }
            minimumTiles(n, m - j);
        }
        return count;
    }
}