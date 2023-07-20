// You are using Java

import java.util.Scanner;

class YoungestAndOldest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input < 0) {
                System.out.println("Invalid Input");
                return;
            }
            if (input > 0) {
                count++;
                min = Math.min(min, input);
                max = Math.max(max, input);
            }

        }
        if (count == n) {
            System.out.println(min + " " + max);
        }
    }
}