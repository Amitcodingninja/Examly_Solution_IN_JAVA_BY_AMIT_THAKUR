// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10) {
            System.out.println("Invalid Input");
        } else {
            int lastDigit = n % 10;
            int firstDigit = n;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            int difference = Math.abs(firstDigit - lastDigit);
            System.out.println(difference);
        }

    }
}