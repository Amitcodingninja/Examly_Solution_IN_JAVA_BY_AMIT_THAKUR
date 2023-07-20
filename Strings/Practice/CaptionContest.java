// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int minDiff = 0;
        int maxDiff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != '?' && s2.charAt(i) != '?' && s1.charAt(i) != s2.charAt(i)) {
                minDiff++;
                maxDiff++;
            } else if (s1.charAt(i) == '?' || s2.charAt(i) == '?') {
                maxDiff++;
            }
        }
        System.out.println(minDiff + " " + maxDiff);
    }

}