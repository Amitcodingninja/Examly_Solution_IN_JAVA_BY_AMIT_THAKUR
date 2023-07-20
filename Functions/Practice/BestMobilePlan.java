// You are using Java

import java.text.DecimalFormat;
import java.util.*;

class BestMobilePlan {
    public static void printPlanDetails(int d, int e, int n) {
        float a = 0, b = 0;
        DecimalFormat d1 = new DecimalFormat("0.00");
        if (d > 100) {
            a = (float) ((d - 100) * 0.25);
        }
        if (d > 250) {
            b = (float) ((d - 250) * 0.45);
        }
        a = (float) (a + (e * 0.15) + (n * 0.2));
        b = (float) (b + (e * 0.35) + (n * 0.25));
        System.out.println("Plan A costs " + d1.format(a));
        System.out.println("Plan B costs " + d1.format(b));
        if (a == b) {
            System.out.println("Plan A and B are the same price");
        } else {
            if (a < b) {
                System.out.println("Plan A is cheapest");
            } else {
                System.out.println("Plan B is cheapest");
            }

        }
    }

    public static void main(String[] args) {
        int day, eve, night;
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        eve = sc.nextInt();
        night = sc.nextInt();
        printPlanDetails(day, eve, night);
    }
}