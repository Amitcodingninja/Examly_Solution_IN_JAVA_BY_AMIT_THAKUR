import java.util.*;
import java.io.*;

class Dailyroutine {
    public static void main(String[] args) {
        int i, len, count = 0;
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        len = s.length();
        for (i = 0; i < len; i++) {
            if (s.charAt(i) == 'C') {
                count = 1;
                break;
            } else if ((s.charAt(i) == 'S') || (s.charAt(i) == 'E')) {
                break;
            }
        }
        for (; i < len; i++) {
            if (s.charAt(i) == 'E') {
                count++;
                break;
            } else if ((s.charAt(i) == 'S') && (count == 1)) {
                count = -100;
                break;
            } else if (s.charAt(i) == 'S') {
                break;
            }

        }
        for (; i < len; i++) {
            if (s.charAt(i) == 'S') {
                count++;
            } else if (s.charAt(i) == 'C') {
                count = -100;
                break;
            }
        }

        if (count > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
