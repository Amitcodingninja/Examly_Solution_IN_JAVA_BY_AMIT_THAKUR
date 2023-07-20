
// You are using Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        findValue(x, y);
    }

    public static void findValue(String a, String b) {
        StringBuilder reversedA = new StringBuilder(a).reverse();
        StringBuilder reversedB = new StringBuilder(b).reverse();
        if (reversedA.indexOf(reversedB.toString()) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}