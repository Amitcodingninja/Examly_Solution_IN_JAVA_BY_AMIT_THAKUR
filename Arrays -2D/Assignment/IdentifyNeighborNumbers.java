// You are using Java

import java.util.Scanner;

class IdentifyNeighborNumbers {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] a = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (isWithinRange(a[i][j])) {
                    if (i < n - 2 && isWithinRange(a[i + 2][j])) {
                        a[i + 1][j] = 0; // vertical
                    }
                    if (j < n - 2 && isWithinRange(a[i][j + 2])) {
                        a[i][j + 1] = 0; // horizontal
                    }
                    if (i > 0 && j > 0 && isWithinRange(a[i - 1][j - 1])) {
                        a[i - 1][j] = a[i][j - 1] = 0; // decreasing slope
                    }
                    if (i < n - 1 && j > 0 && isWithinRange(a[i + 1][j - 1])) {
                        a[i + 1][j] = a[i][j - 1] = 0; // increasing slope
                    }
                }

            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isWithinRange(int number) {
        return number >= 1 && number <= 10;
    }
}
