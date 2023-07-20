// You are using Java

import java.util.Scanner;
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);   
        int show1People = sc.nextInt(); 
        double show1Rating = sc.nextDouble(); 
        int show2People = sc.nextInt();        double show2Rating = sc.nextDouble();        int show3People = sc.nextInt();        double show3Rating = sc.nextDouble();        double overallRating = (show1People * show1Rating + show2People * show2Rating + show3People * show3Rating) / (show1People + show2People + show3People);        System.out.printf("%.2f", overallRating);    }}