// You are using Java

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        boolean isAlternating = true;
        if (code.length() > 2) {
            char firstChar = code.charAt(0);
            char secondChar = code.charAt(1);

            if (firstChar == secondChar) {
                isAlternating = false;

            } else {
                for (int i = 2; i < code.length(); i++) {
                    if (i % 2 == 0 && code.charAt(i) != firstChar) {
                        isAlternating = false;
                        break;
                    } else if (i % 2 == 1 && code.charAt(i) != secondChar) {
                        isAlternating = false;
                        break;
                    }
                }
            }
        } else {
            isAlternating = false;
        }
        if (isAlternating) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}