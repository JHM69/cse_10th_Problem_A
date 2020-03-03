import java.util.Scanner;
public class Main {
   
     public static void main(String[] args)
     {
            Scanner input=new Scanner(System.in) ;
 int m,a,b,i;
 m=input.nextInt();
 for(i=0;i<m;i++)
 {
      a=input.nextInt();
       b=input.nextInt();
       if(a<b)
           System.out.println("<");
       else if(a>b)
           System.out.println(">");
       else
           System.out.println("=");
 }
   
    
     }
    
}