// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int amberCount = 0;
        int brassCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                amberCount++;
            } else {

                brassCount++;
            }
        }
        System.out.println(Math.min(amberCount, brassCount));
    }

}