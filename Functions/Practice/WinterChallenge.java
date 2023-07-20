
// You are using Java
import java.util.*;

class ModInverse {
    public static int findValue(int x, int m) {
        for (int n = 1; n < m; n++) {
            if ((x * n) % m == 1) {
                return n;
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int m = sc.nextInt();
        int result = ModInverse.findValue(x, m);
        System.out.println(result);
    }
}