// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i) == '0') {
                zeroCount++;
            } else {
                oneCount++;
            }
        }
        if (zeroCount == 1 || oneCount == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}