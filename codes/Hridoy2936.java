import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int t,a,b;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            a=scan.nextInt();
            b=scan.nextInt();
            if(a>b)
                System.out.println(">");
            else if(a==b)
                System.out.println("=");
            else if(a<b)
                System.out.println("<");
        }
    }
}