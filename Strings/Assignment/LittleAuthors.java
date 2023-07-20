// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        boolean found = false;
        for (int i = 0; i < 26; i++) {
            int sum = 0;
            for (int j = 0; j < 26; j++) {
                if (i != j) {
                    sum += charCount[j];
                }
            }
            if (charCount[i] == sum) {
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}