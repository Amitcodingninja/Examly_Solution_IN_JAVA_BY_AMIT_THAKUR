// You are using Java

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static Vector<Integer> generateSeries(int N) {
        Vector<Integer> series = new Vector<>();
        int num = 2;
        while (series.size() < N) {
            if (isPrime(num)) {
                series.add(num);
            }
            num++;
        }
        return series;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Vector<Integer> series = generateSeries(N);
        for (int i = 0; i < series.size(); i++) {
            System.out.print(series.get(i));
            if (i != series.size() - 1) {
                System.out.print(" ");
            }

        }
        scanner.close();
    }
}