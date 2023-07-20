// You are using Java

import java.util.Scanner;
public class Main {    
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);        
        // System.out.println("Enter the x-coordinate of the left bottom vertex:");        
        int x = scanner.nextInt();        
        // System.out.println("Enter the y-coordinate of the left bottom vertex:");        
        int y = scanner.nextInt();        
        // System.out.println("Enter the length of a side:");        
        int l = scanner.nextInt();       
        x = x + (l / 2);        
        y = y + (l / 2);        
        System.out.printf("%d %d", x ,y);    
        
    }
    
}