// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int side = sc.nextInt();
        int centerX = x + side / 2;
        int centerY = y + side / 2;
        System.out.println(centerX + " " + centerY);
    }

}