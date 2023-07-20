// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int adults = sc.nextInt();
        int kids = sc.nextInt();
        int legs = sc.nextInt();
        int minLegs = adults * 2 + Math.max(0, kids - adults * 2) * 2;
        int maxLegs = adults * 2 + kids * 2;
        if (legs >= minLegs && legs <= maxLegs && legs % 2 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}