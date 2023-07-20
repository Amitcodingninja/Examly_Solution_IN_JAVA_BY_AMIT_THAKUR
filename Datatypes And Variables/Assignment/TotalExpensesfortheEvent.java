
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int branding_expenses, travel_expenses, food_expenses, logistics_expenses;
        // System.out.println("Enter branding expenses:");
        branding_expenses = scanner.nextInt();
        // System.out.println("Enter travel expenses:");
        travel_expenses = scanner.nextInt();
        // System.out.println("Enter food expenses:");
        food_expenses = scanner.nextInt();
        // System.out.println("Enter logistics expenses:");
        logistics_expenses = scanner.nextInt();
        float total_expenses = branding_expenses + travel_expenses + food_expenses + logistics_expenses;
        float branding_expenses_percentage = (float) branding_expenses / total_expenses * 100;
        float travel_expenses_percentage = (float) travel_expenses / total_expenses * 100;
        float food_expenses_percentage = (float) food_expenses / total_expenses * 100;
        float logistics_expenses_percentage = (float) logistics_expenses / total_expenses * 100;
        System.out.printf("Total expenses : Rs.%.2f\n", total_expenses);
        System.out.printf("Branding expenses percentage : %.2f%%\n", branding_expenses_percentage);
        System.out.printf("Travel expenses percentage : %.2f%%\n", travel_expenses_percentage);
        System.out.printf("Food expenses percentage : %.2f%%\n", food_expenses_percentage);
        System.out.printf("Logistics expenses percentage : %.2f%%\n", logistics_expenses_percentage);
        scanner.close();
    }

}
