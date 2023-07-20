// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        double gainPercentage = ((c - a - b) * 1.0 / (a + b)) * 100;
        gainPercentage = Math.round(gainPercentage * 100) / 100.0;
        System.out.printf("%.2f\n", gainPercentage);
    }

}