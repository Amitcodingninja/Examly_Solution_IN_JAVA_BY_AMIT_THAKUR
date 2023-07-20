// You are using Java

import java.util.*;
class VersionManagementSystem {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();      
        int m = sc.nextInt();     
        int k = sc.nextInt();      
        int c = 0;     
        int cc = 0;    
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < m; i++) {
            a.add(sc.nextInt()); 
            }        
            Set<Integer> b = new HashSet<>(); 
            for (int i = 0; i < k; i++) { 
                b.add(sc.nextInt()); 
                }        
                for (int i : a) {  
        if (b.contains(i)) {
        c++;     
        }    
        }     
        for (int i = 1; i <= n; i++) {
        if (!a.contains(i)) {    
        if (!b.contains(i)) { 
        cc++;               
        }          
        }        
            
        }       
        System.out.println(c + " " + cc);   
        }}