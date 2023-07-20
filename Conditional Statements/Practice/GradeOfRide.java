// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hurlFactor = sc.nextInt();
        int spinFactor = sc.nextInt();
        int speedFactor = sc.nextInt();
        int grade;
        if (hurlFactor > 50 && spinFactor > 60 && speedFactor > 100) {
            grade = 10;
        } else if (hurlFactor > 50 && spinFactor > 60) {
            grade = 9;
        } else if (spinFactor > 60 && speedFactor > 100) {
            grade = 8;
        } else if (hurlFactor > 50 && speedFactor > 100) {
            grade = 7;
        } else if (hurlFactor > 50 || spinFactor > 60 || speedFactor > 100) {
            grade = 6;
        } else {
            grade = 5;
        }
        System.out.println(grade);
    }
}