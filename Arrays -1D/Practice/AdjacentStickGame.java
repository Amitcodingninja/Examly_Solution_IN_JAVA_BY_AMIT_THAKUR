
// You are using Java
import java.util.*;

class GAME {
    public static void main(String[] args) {
        int n, i, j = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i = i + 2) {
            if (a[i] < a[i + 1]) {
                j = j + a[i];
            } else {
                j = j + a[i + 1];
            }

        }
        System.out.println(j);
    }
}