// You are using Java

import java.util.Scanner;

class Age2 {
    public static void main(String[] args) {
        int r, c, i, j, age, sum = 0, count = 0, avg = 0;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        int a[][] = new int[r][c];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        age = sc.nextInt();
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                sum += a[i][j];
            }
            avg = sum / c;
            if (avg > age) {
                count++;
            }
            sum = 0;
            avg = 0;
        }
        System.out.println(count);
    }
}