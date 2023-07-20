import java.io.*;
import java.util.*;

class NumberType {
    public static int findType(int a) {
        int i, j = 0;
        for (i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                j = j + i;
            }
        }
        if (j == a)
            return 0;
        else if (j > a)
            return -1;
        else
            return 1;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (findType(num) == 0) {
            System.out.println(num + " is a perfect number");
        } else if (findType(num) == 1) {
            System.out.println(num + " is a deficient number");
        } else {
            System.out.println(num + " is an abundant number");
        }

    }
}
