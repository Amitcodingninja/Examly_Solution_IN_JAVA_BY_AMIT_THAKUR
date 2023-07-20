// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Welcome to the show");
        if (age < 15) {
            System.out.println("Please note that you should be accompanied by an adult");
        }
    }

}