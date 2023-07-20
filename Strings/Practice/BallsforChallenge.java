// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int len = str1.length();
        int c = 0;
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                System.out.print(str1.charAt(i) == 'W' ? 'B' : 'W');
            } else {
                c++;
                System.out.print(c % 2 == 0 ? str2.charAt(i) : str1.charAt(i));
            }
        }
    }

}