import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t;
        t=input.nextInt();
        for (int i = 1; i <=t; i++) {
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