
// You are using Java
import java.util.Scanner;

public class Main {
    public static int calculate(int x, int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = calculate(x, n);
        System.out.println(result);
    }
}