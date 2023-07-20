// You are using Java

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        try {
            int cost, noOfDays;
            Scanner sc = new Scanner(System.in);
            cost = Integer.parseInt(sc.nextLine());
            noOfDays = Integer.parseInt(sc.nextLine());
            int result = cost / noOfDays;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
