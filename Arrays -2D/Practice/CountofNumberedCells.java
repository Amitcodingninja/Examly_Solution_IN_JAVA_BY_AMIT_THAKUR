
// You are using Java
import java.util.Arrays;
import java.util.Scanner;

class CountOfNumberedCells {
    public static void main(String[] args) {
        int n, count;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        count = (int) Arrays.stream(a)
                .flatMapToInt(Arrays::stream)
                .filter(num -> num < 11)
                .count();
        System.out.println(count);
    }
}