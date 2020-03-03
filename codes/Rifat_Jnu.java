import java.util.Scanner;

public class Main 
{

  public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int a,b,t=1,n;
        n=input.nextInt();
        while(t<=n)
                 
      {
          
          a=input.nextInt();
          b=input.nextInt();
          
          
        if(a==b)
          System.out.println("=");
        else if(a<b)
          System.out.println("<");
        else
          System.out.println(">");
        
        t++;
    }
    
  }
}