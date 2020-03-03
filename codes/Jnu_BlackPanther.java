import java.util.Scanner;
public class Main {
     public static void main(String[] args) {   
    Scanner input=new Scanner (System.in);
    int x;
    x=input.nextInt();
    int a,b;

    for(int i=0;i<x;i++)
    {
       a=input.nextInt();
       b=input.nextInt();
       if(a<b)
       {
           System.out.println("<");
       }
       else if(a>b)
       {
           System.out.println(">");
       }
       else
       {
           System.out.println("=");
       }
    }
    
     }
}