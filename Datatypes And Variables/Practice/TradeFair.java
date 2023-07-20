// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_guests;
        // System.out.println("Enter total number of guests: ");
        total_guests = scanner.nextInt();
        int guests_on_day1 = (2 * total_guests) / 7;
        int guests_on_day2 = 2 * guests_on_day1;
        int guests_on_day3 = guests_on_day1 / 2;
        System.out.println("Number of attendees on day 1 : " + guests_on_day1);
        System.out.println("Number of attendees on day 2 : " + guests_on_day2);
        System.out.println("Number of attendees on day 3 : " + guests_on_day3);

    }

}