// You are using Java

import java.util.Scanner;
class SingleExpansionRoute {
    public static void main(String[] args) { 
        int i, j, n, s = 0, k = 0;  
        Scanner sc = new Scanner(System.in); 
        n = sc.nextInt(); 
        int a[][] = new int[n][n]; 
        for (i = 0; i < n; i++) {  
        for (j = 0; j < n; j++) {   
        a[i][j] = sc.nextInt();   
        }        }   
        for (i = 0; i < n; i++) { 
        for (j = 0; j < n; j++) {  
        if (a[i][j] < 11 && a[i][j] > 1) {
        if (i > 0 && a[i - 1][j] == 20) { 
        k++;              
        }              
        if (i < n - 1 && a[i + 1][j] == 20) { 
            k++; 
            }     
        if (j > 0 && a[i][j - 1] == 20) { 
        k++;             
        }            
        if (j < n - 1 && a[i][j + 1] == 20) {
        k++;    
        }      
        }          
        if (k == 1) {     
        System.out.print(i + 1 + " "); 
        System.out.print(j + 1);    
        System.out.println();  
        s = 1;          
        }          
        k = 0;       
        }        }   
        if (s == 0) {  
        System.out.println("-1");   
        }    
        
    }}