import java.io.*;
import java.util.*;

class copartnerstrain {
    public static void main(String[] args) {
        int a, count;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        count = a % 8;
        if (count == 0) {
            a = a - 1;
        } else if (count < 4) {
            a = a + 3;
        } else if (count < 7) {
            a = a - 3;
        } else if (count == 7) {
            a = a + 1;
        }
        switch (count) {
            case 0:
                System.out.println(a + "SL");
                break;
            case 1:
                System.out.println(a + "LB");
                break;
            case 2:
                System.out.println(a + "MB");
                break;
            case 3:
                System.out.println(a + "UB");
                break;
            case 4:
                System.out.println(a + "LB");
                break;
            case 5:
                System.out.println(a + "MB");
                break;
            case 6:
                System.out.println(a + "UB");
                break;
            case 7:
                System.out.println(a + "SU");
                break;
        }

    }
}
