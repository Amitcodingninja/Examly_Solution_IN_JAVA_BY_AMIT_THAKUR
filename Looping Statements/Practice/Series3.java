// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i, j = 0, k = 0, r = 30, s = 35;
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                r = r + j;
                System.out.print(r + " ");
                j = j + 8;
            } else {
                s = s + k;
                System.out.print(s + " ");
                k = k + 6;
            }
        }
        scanner.close();
    }
}