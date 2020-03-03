import java.util.Scanner;
public class Main
{
     public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int t,i;
        long a,b;
        t = input.nextInt();
        for(i=0;i<t;i++)
        {
            a= input.nextLong();
            b=input.nextLong();
            if(a>b) System.out.println(">");
            else if(a<b) System.out.println("<");
            else System.out.println("=");
        }
        
    }
    
}