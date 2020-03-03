import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t,i;
        
         
        t=in.nextInt();
        int a[]=new int[t];
        int b[]=new int[t];
        if(t<15){
        for(i=0;i<t;i++)
        {
          a[i]=in.nextInt();
          b[i]=in.nextInt();
          
        }}
        for(i=0;i<t;i++)
        {
            if(a[i]>b[i])
                System.out.println(">");
          else if(a[i]<b[i])
                System.out.println("<");
          else
                System.out.println("=");
        }
    }
    
}