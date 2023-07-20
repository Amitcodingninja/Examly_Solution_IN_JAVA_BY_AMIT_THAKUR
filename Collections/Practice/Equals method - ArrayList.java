// You are using Java

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        ArrayList<String> a1 = new ArrayList<String>(n);
        ArrayList<String> a2 = new ArrayList<String>(n);
        for (i = 0; i < n; i++) {
            a1.add(sc.nextLine());
        }
        for (i = 0; i < n; i++) {
            a2.add(sc.nextLine());
        }
        if (a1.equals(a2)) {
            System.out.println("Both lists are same");
        } else {
            System.out.println("Both lists are different");
        }
    }
}
