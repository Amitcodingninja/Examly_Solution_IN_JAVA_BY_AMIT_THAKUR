// You are using Java

import java.util.*;

class Fibonacci {
    public static int fiboLastDigit(int a) {
        long x = 0, y = 0, z = 1, i;
        int s;
        for (i = 0; i < a; i++) {
            z = y + z;
            x = z;
            z = y;
            y = x;
        }
        x = x % 10;
        s = (int) x;
        return s;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(fiboLastDigit(n));
    }
}