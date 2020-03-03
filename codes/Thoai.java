import java.util.*;
public class Main {
    
 public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int i,j,t=1,n;
        n=input.nextInt();
        while(t<=n)
        {
            i=input.nextInt();
            j=input.nextInt();
            if(i==j)
                System.out.println("=");
            else if(i<j)
                    System.out.println("<");
            else
                System.out.println(">");
            t++;
        }
    }
    
}