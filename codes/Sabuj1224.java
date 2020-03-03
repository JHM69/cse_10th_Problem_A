import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int count;
        count = input.nextInt();
        
        for(int i = 1;i<=count;i++)
        {
          
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            if(num1>num2)
                System.out.println(">");
            else if(num1<num2)
                System.out.println("<");
            else
                System.out.println("=");
        }
        }
    }