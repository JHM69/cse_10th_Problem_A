import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner i=new Scanner(System.in);
       int t,k,a,b;
       t=i.nextInt();
       for(k=0;k<t;k++)
       {
           a=i.nextInt();
           b=i.nextInt();
           if(a<b) System.out.println("<");
           else if(a>b) System.out.println(">");
           else System.out.println("=");
       }
    }
    
}