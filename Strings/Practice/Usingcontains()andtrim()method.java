// You are using Java

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String searchString = sc.nextLine().trim();
        if (sentence.contains(searchString)) {
            System.out.println("String is found in the sentence");

        } else {
            System.out.println("String is not found in the sentence");
        }

    }

}