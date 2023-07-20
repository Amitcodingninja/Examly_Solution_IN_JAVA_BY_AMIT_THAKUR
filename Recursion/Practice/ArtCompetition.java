// You are using Java

import java.util.*;

class EnrollNumbers {
    static int i = 1;

    public static void printNumbers(int n) {
        if (i <= n) {
            System.out.print(i + " ");
            i++;
            printNumbers(n);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printNumbers(n);
    }
}