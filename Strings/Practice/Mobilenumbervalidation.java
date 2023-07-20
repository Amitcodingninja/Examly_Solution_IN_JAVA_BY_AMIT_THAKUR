// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mobileNumber = sc.nextLine();
        StringBuilder sb = new StringBuilder(mobileNumber);
        if (sb.substring(0, 3).compareTo("+91") == 0 && sb.length() == 13) {
            System.out.println("Mobile number valid");
        } else {
            System.out.println("Mobile number invalid");
        }

    }
}