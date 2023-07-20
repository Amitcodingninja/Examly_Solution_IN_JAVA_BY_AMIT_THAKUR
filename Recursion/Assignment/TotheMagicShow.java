// You are using Java

import java.util.*;

class Reachable {
    public static int isReachable(int x1, int y1, int x2, int y2) {
        int x = 0, y = 0;
        if ((x1 > x2) || (y1 > y2)) {
            return 0;
        } else if ((x1 == x2) && (y1 == y2)) {
            return 1;
        } else if ((x1 <= x2) && (y1 <= y2)) {
            x = isReachable(x1, y1 + x1, x2, y2);
            y = isReachable(x1 + y1, y1, x2, y2);
        }
        if ((x == 1) || (y == 1)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int x1, y1, x2, y2, i;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        i = isReachable(x1, y1, x2, y2);
        if (i == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}