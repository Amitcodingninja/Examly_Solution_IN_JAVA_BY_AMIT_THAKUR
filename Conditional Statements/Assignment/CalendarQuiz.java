// You are using Java

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year, 1, 1);
        String dayOfWeek = date.getDayOfWeek().toString();
        System.out.println(dayOfWeek.substring(0, 1) + dayOfWeek.substring(1).toLowerCase());
    }

}