// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            sb.append(inputString.charAt(i));
            if (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
                sb.append("*");
            }
        }
        System.out.println(sb.toString());
    }

}