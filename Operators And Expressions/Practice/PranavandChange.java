// You are using Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        int[] notes = { 100, 50, 10, 5, 2, 1 };
        int noteCount = 0;
        for (int note : notes) {
            noteCount += change / note;
            change %= note;
        }
        System.out.println(noteCount);
    }
}