// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double purchasePrice = sc.nextDouble();
        double repairCharges = sc.nextDouble();
        double sellingPrice = sc.nextDouble();
        double gainPercentage = ((sellingPrice - purchasePrice - repairCharges) / (purchasePrice + repairCharges))
                * 100;
        System.out.printf("%.2f", gainPercentage);
    }
}