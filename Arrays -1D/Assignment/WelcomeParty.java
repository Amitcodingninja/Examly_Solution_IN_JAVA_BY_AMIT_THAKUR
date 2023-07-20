// You are using Java

import java.util.Scanner;

class WelcomeParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0, j = 0, c = 0;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input == 1) {
                k++;
            } else if (input == 2) {
                j++;
            } else {
                c++;
            }
        }
        int result = Math.max(k, Math.max(j, c));
        System.out.println(n - result);
    }
}