import java.util.Scanner;
public class Main {
     public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        int a,b,t=0,n;
        n=x.nextInt();
        while(t<n)
        {
            a=x.nextInt();
            b=x.nextInt();
            if(a<b)
                System.out.println("<");
            else if(a>b)
                System.out.println(">");
            else
                System.out.println("=");
            t++;
        }
    }
}