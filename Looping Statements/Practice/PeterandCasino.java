// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1, m2, m3, ru, t = 0;
        ru = scanner.nextInt();
        m1 = scanner.nextInt();
        m2 = scanner.nextInt();
        m3 = scanner.nextInt();
        while (ru > 0) {
            if (ru > 0) {
                m1++;
                ru--;
                t++;
            }
            if (ru > 0) {
                m2++;
                ru--;
                t++;
            }
            if (ru > 0) {
                m3++;
                ru--;
                t++;
            }
            if (m1 >= 25) {
                m1 = m1 - 25;

                ru = ru + 20;
            }
            if (m2 >= 120) {
                m2 = m2 - 120;
                ru = ru + 80;
            }
            if (m3 >= 12) {
                m3 = m3 - 12;
                ru = ru + 8;
            }
        }
        System.out.println(t);
    }
}