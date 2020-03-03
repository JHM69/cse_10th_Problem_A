import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a,b,n;
        n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            a=input.nextInt();
            b=input.nextInt();
            if(a>b)
                System.out.println(">");
            else if(a<b)
                System.out.println("<");
            else
                System.out.println("=");
        }
      
    }
}