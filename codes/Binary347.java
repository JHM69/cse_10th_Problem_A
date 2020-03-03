import java.util.Scanner;


public class Main {
   
    public static void main(String[] args) {
        int x,a,b,i;
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        for(i=1;i<=x;i++)
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