import java.util.*;
import java.io.*;
import java.math.*;

class Tilegame {
    public static void main(String[] args) {
        int side, number, i = 1, result, area, answer = 0;
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();
        number = sc.nextInt();
        result = (int) ((int) Math.pow(2, i) * Math.pow(2, i));
        while (result < number) {
            answer = result;
            i++;
            result = (int) ((int) Math.pow(2, i) * Math.pow(2, i));
        }
        area = side * side;
        System.out.println(area * answer);
    }

}
