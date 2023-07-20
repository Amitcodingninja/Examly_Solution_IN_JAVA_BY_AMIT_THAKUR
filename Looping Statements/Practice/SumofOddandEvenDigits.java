// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = Character.getNumericValue(n.charAt(i));
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        System.out.println(oddSum + " " + evenSum);

    }
}
