// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ticketCost = sc.nextDouble();
        int ticketsPurchased = sc.nextInt();
        double discount = 0;
        if (ticketsPurchased >= 50 && ticketsPurchased <= 100) {
            discount = 0.1;
        } else if (ticketsPurchased >= 101 && ticketsPurchased <= 200) {
            discount = 0.2;
        } else if (ticketsPurchased >= 201 && ticketsPurchased <= 400) {
            discount = 0.3;
        } else if (ticketsPurchased >= 401 && ticketsPurchased <= 500) {
            discount = 0.4;
        } else if (ticketsPurchased > 500) {
            discount = 0.5;
        }
        double totalCost = ticketCost * ticketsPurchased * (1 - discount);
        System.out.printf("%.2f", totalCost);
    }

}