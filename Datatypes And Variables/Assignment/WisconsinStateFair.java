
// You are using Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        for (int i = 10; i <= a; i++) {
            int x = 80 * i + 50 * (i - 10);
            if (a - x >= 0 && a - x < 130) {
                System.out.println(i);
                System.out.println((i - 10));
            }
        }
        scanner.close();
    }

}