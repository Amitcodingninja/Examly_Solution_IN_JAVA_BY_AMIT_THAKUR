// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emailAddress = sc.nextLine();
        System.out.println(emailAddress);
        String[] acceptedDomains = { "com", "in", "net", "org" };
        String domain = emailAddress.substring(emailAddress.lastIndexOf(".") + 1);
        boolean isValid = false;
        for (String acceptedDomain : acceptedDomains) {
            if (domain.contains(acceptedDomain)) {
                isValid = true;
                break;
            }
        }
        if (isValid) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }
}