
// You are using Java
import java.util.Scanner;

class Dots {
    public static String find(int n) {
        int sum = 0;
        int i = 1;
        while (sum < n) {
            sum += i;
            i++;
        }
        if (sum == n) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = Dots.find(n);
        System.out.println(result);
    }
}