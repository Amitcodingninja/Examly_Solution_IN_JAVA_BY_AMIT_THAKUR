
// You are using Java
import java.util.Scanner;

class CollisionsOfEvents {
    public static void main(String[] args) {
        int n, m, i, j, k = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] a = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        for (i = 0; i < m; i++) {
            int count = 0;
            for (j = 0; j < n; j++) {
                if (a[j][i] == 1) {
                    count++;
                }

            }
            if (count > 2) {
                k += (count - 1) * count / 2;
            } else if (count == 2) {
                k++;
            }
        }
        System.out.println(k);
    }
}