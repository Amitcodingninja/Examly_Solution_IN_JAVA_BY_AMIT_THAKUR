
// You are using Java
import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1, a2, a3, a4, a5, a6, sum;
        a1 = a / 100;
        a = a % 100;
        a2 = a / 50;
        a = a % 50;
        a3 = a / 10;
        a = a % 10;
        a4 = a / 5;
        a = a % 5;
        a5 = a / 2;
        a = a % 2;
        a6 = a;
        sum = a1 + a2 + a3 + a4 + a5 + a6;
        System.out.println(sum);

    }

}