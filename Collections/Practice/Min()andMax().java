// You are using Java

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> price = new ArrayList<Integer>(n);
        for (i = 0; i < n; i++) {
            price.add(sc.nextInt());
        }
        for (i = 0; i < n; i++) {
            System.out.print(price.get(i) + " ");
        }
        System.out.println();
        System.out.print(Collections.min(price) + " ");
        System.out.print(Collections.max(price));
    }
}
