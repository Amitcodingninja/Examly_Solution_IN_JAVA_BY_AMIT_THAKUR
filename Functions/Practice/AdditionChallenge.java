import java.io.*;
import java.util.*;
import java.math.*;

class AdditionChallenge {
    public static long findSum(int n) {
        long s = 0;
        int i;
        for (i = 0; i <= n; i++) {
            s = (long) (s + Math.pow(2, i));
        }
        return s;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(findSum(n));
    }
}
