// You are using Java

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] intArray = new int[size];
            for (int i = 0; i < size; i++) {
                intArray[i] = sc.nextInt();
            }
            int index = sc.nextInt();
            sc.close();
            System.out.println("Value at " + index + " = " + intArray[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound.");
        }
    }
}
