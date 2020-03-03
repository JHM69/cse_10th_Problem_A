import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t;
        t=input.nextInt();
        int []a=new int[t];
        int []b=new int[t];
        if(t<15)
        {
            for (int i = 0; i < t; i++) {
                a[i]=input.nextInt();
                b[i]=input.nextInt();
                  
            }
            
            for (int i = 0; i < t; i++) {
                if(a[i]<1000000001&&b[i]<1000000001){
                if(a[i]<b[i])
                    System.out.println("<");
                else if(a[i]>b[i])
                    System.out.println(">");
                else
                    System.out.println("="); 
                }
            }
            
       
                                                
        }
    
    }
    
}