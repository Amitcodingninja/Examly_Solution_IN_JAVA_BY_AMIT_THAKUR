// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int si = n + (n - 1);
        int sp = n;
        int st = -1;
        for (int i = 1; i <= n; i++) {
            sp = sp - 1;
            st = st + 2;
            for (int j = 1; j <= sp; j++) {
                System.out.print("b");
            }
            for (int k = 1; k <= st; k++) {
                if (i > 1 && i < n) {
                    if (k > 1 && k < st) {
                        System.out.print("i");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                }
            }
            for (int l = 1; l <= sp; l++) {
                System.out.print("b");
            }
            System.out.println();
        }
    }
}