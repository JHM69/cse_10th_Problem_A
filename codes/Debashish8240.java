import java.util.*;
public class Main {

   
    public static void main(String[] args) {
        
        
         Scanner input = new Scanner(System.in);
        int n;
         n=input.nextInt();
         for(int i=1;i<=n;++i){
         
             int a,b;
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