// You are using Java

import java.util.*;

class FindSum {
    public static int summation(int n, int m) {
        if (m == 0)
            return n;
        if (m != 0) {
            n = n * (1 + n) / 2;
            n = summation(n, m - 1);
        }
        return n;
    }

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int res = summation(n, m);
        System.out.println(res);
    }
}