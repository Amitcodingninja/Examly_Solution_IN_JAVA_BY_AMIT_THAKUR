// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                System.out.println("Prize 3");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Prize 2");
            } else {
                System.out.println("Prize 1");
            }
        } else {
            System.out.println("No prize");
        }
    }

}