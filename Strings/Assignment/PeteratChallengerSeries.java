// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int peterScore = 0;
        int horejsiScore = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                peterScore++;
            } else {
                horejsiScore++;
            }
            if ((peterScore >= 11 || horejsiScore >= 11) && Math.abs(peterScore - horejsiScore) >= 2) {
                break;
            }
        }
        if (peterScore > horejsiScore) {
            System.out.println("Win");
        } else {
            System.out.println("Lose");
        }
    }

}