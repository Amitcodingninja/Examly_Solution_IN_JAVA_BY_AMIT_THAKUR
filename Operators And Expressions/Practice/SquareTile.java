import java.util.*;
class SquareTile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double l= sc.nextDouble();
        double n= sc.nextDouble();
        int i;
        int m;
        i=1;
        m=0;
        while(i*i <= n)
    {
        m=i*i;
        i++;
    }
   double a=m*(l*l);
    System.out.println(a);
    }
    
}