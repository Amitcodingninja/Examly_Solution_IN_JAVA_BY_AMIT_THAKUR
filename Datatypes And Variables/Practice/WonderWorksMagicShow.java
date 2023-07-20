// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        float r1, r2, r3;
        n1 = scanner.nextInt();
        r1 = scanner.nextFloat();
        n2 = scanner.nextInt();
        r2 = scanner.nextFloat();
        n3 = scanner.nextInt();
        r3 = scanner.nextFloat();
        float overallAverage = (n1 * r1 + n2 * r2 + n3 * r3) / (n1 + n2 + n3);
        System.out.printf("%.2f\n", overallAverage);
    }

}