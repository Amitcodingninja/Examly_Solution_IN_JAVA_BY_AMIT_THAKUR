// You are using Java

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        PriorityQueue<Integer> ropes = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int ropeLength = scanner.nextInt();
            ropes.add(ropeLength);
        }
        while (ropes.size() > 1) {
            int first = ropes.poll();
            int second = ropes.poll();
            int newRope = first + second - 2 * k;
            ropes.add(newRope);
        }
        System.out.println(ropes.peek());
    }
}