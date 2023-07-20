// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print((2 * i * i + 34 * i - 16) + " ");
            i++;

        }
        scanner.close();
    }
}