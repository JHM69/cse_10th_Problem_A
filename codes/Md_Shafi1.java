import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    int t,m,n;
        t = input.nextInt();
            for (int i = 1; i <= t; i++) {
            m = input.nextInt();
            n = input.nextInt();
            if(m < n)
            {
                System.out.println("<");
            }
            else if(m > n)
            {
                System.out.println(">");
            }
            else
            {
                System.out.println("=");
            }
        }
    }
}