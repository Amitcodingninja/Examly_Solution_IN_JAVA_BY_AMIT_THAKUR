// You are using Java


import java.util.*;
class favouriteSequence {  
    public static void main(String [] args) {    
        int n,m,i,j,k=0;    
        Scanner sc = new Scanner(System.in); 
        n = sc.nextInt();      
        int a[] = new int[n];  
        for(i=0;i<n;i++) {     
            a[i] = sc.nextInt();    
            }        
m = sc.nextInt(); 
int b[] = new int[m]; 
for(i=0;i<m;i++) {  
b[i] = sc.nextInt();    
}        
for(j=0;j<n;j++) 
{            
if((b[0]==a[j])&&(j+m<=n))  
{       
for(i=0;i<m;i++){if(b[i]==a[j+i]){k++;}}
}        
    
}        
if(k == m) {
    System.out.println("Yes");     
    }        
    else {    
System.out.println("No"); 
}}}