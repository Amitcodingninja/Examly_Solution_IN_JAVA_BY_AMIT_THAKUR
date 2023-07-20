// You are using Java

import java.util.Scanner;

class MyCalculator {
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        if (n == 0 && p == 0)
            throw new Exception("Both n and p should not be zero");
        return (long) Math.pow((double) n, (double) p);
    }
}

class Main {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        MyCalculator M = new MyCalculator();
        try {
            System.out.println(M.power(n, p));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
