// You are using Java

import java.util.*;

class NiceNumber {
    public static int findType(int a) {
        int i, count = 0;
        for (i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }

        }
        if (count == 4) {
            return 1;
        } else {

            return 0;
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (findType(num) == 1) {
            System.out.println(num + " is a nice number");
        } else {
            System.out.println(num + " is not a nice number");
        }
    }
}