import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int t,a,b,i;
        Scanner input=new Scanner(System.in);
        t=input.nextInt();
        for(i=1;i<=t;++i)
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