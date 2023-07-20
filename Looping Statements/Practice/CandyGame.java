// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n > 0) {
            if (n % 10 == 4) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}