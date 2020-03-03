import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int t,a,b,i;
    t=sc.nextInt();
    for(i=1;i<=t;i++)
    {
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
            System.out.println(">");
         else if(a<b)
            System.out.println("<");
           else if(a==b)
            System.out.println("=");
    }
    }
    }
   