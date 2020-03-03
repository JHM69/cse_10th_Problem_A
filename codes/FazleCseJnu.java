import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y,p=1,n;
        n=input.nextInt();
        while(p<=n)
        {
            x=input.nextInt();
            y=input.nextInt();
            if(x==y)
                System.out.println("=");
            else if(x<y)
                System.out.println("<");
            else
                System.out.println(">");
            p++;
        }
        
    }          
}