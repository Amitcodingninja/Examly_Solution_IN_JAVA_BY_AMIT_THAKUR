// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        boolean canBeMatched = true;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != '?' && y.charAt(i) != '?' && x.charAt(i) != y.charAt(i)) {
                canBeMatched = false;
                break;
            }
        }
        if (canBeMatched) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}