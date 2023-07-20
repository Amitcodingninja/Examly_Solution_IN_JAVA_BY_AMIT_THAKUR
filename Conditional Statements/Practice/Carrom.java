// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coinsLeft = sc.nextInt();
        if (coinsLeft < 1 || coinsLeft > 9) {
            System.out.println("Invalid Input");
            return;
        }
        char pocketedRed = sc.next().charAt(0);
        int score = coinsLeft;
        if (pocketedRed == 'y') {
            score += 5;
        }
        System.out.println(score);
    }

}
