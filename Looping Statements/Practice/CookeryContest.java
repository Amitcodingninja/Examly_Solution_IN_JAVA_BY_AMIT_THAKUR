// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ingredients = new int[n];
        for (int i = 0; i < n; i++) {
            ingredients[i] = sc.nextInt();
        }
        int gcd = findGCD(ingredients);
        for (int i = 0; i < n; i++) {
            System.out.print(ingredients[i] / gcd + " ");
        }
    }

    public static int findGCD(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(arr[i], result);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}