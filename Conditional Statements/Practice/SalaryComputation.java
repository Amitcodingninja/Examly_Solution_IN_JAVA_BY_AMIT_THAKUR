// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basicSalary = sc.nextDouble();
        double hra, da;
        if (basicSalary < 15000) {
            hra = basicSalary * 0.15;
            da = basicSalary * 0.9;
        } else {
            hra = 5000;
            da = basicSalary * 0.98;
        }
        double grossSalary = basicSalary + hra + da;
        System.out.printf("%.2f", grossSalary);
    }

}