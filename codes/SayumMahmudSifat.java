import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x,y,t=1,n;
        n=input.nextInt();
        while(t<=n)
        {
            x=input.nextInt();
            y=input.nextInt();
            if(x==y)
                System.out.println("=");
            else if(x<y)
                    System.out.println("<");
            else
                System.out.println(">");
            t++;
        }
    }
    
}