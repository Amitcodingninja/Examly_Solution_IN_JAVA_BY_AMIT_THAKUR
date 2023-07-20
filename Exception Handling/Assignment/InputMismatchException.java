// You are using Java

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        try {
            n = sc.nextInt();
            System.out.println(n);
        } catch (InputMismatchException i) {
            System.out.println(i);
        }
    }
}
