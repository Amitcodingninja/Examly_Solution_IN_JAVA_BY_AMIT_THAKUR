// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] actions = sc.nextLine().split(" ");
        boolean followedInstructions = true;
        for (int i = 0; i < n - 1; i++) {
            if (actions[i].equals("cookie") && !actions[i + 1].equals("juice")) {
                followedInstructions = false;
                break;
            }
        }
        if (followedInstructions && !actions[n - 1].equals("cookie")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}