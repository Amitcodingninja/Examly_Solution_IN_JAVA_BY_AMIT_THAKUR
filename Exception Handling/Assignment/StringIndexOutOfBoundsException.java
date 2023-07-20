// You are using Java

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String str = sc.nextLine();
            int index = sc.nextInt();
            System.out.println(str.charAt(index));
        } catch (StringIndexOutOfBoundsException s) {
            System.out.println(s);
        }
    }
}
