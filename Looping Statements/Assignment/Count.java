// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0, y = 0;
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                z++;
            } else {
                y++;
            }
        }
        System.out.println(z + " " + y);

    }
}