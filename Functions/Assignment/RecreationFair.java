// You are using Java

import java.util.*;

class Cards {
    public static int findValue(int n1, int n2) {
        int i, j = 1;
        for (i = 2; i <= n1; i++) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                j = j * i;
                n1 = n1 / i;
                n2 = n2 / i;
                i = 1;
            }

        }
        return j;
    }

    public static void main(String[] args) {
        int f1, f2;
        Scanner sc = new Scanner(System.in);
        f1 = sc.nextInt();
        f2 = sc.nextInt();
        System.out.println(findValue(f1, f2));
    }
}