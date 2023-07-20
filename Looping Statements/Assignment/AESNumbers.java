// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lb = scanner.nextInt();
        int ub = scanner.nextInt();
        int count, aes_count = 0;
        while (lb <= ub) {
            count = 0;
            for (int i = 1; i <= lb; i++) {
                if (lb % i == 0) {
                    count++;
                }
            }
            if (count == 4) {
                aes_count++;
            }
            lb++;
        }
        System.out.println(aes_count);
    }
}