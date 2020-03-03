import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        int num,x,y;
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        for (int i = 0; i <num; i++) {
           x=input.nextInt();
           y=input.nextInt();
           if(x>y)
           {
               System.out.println(">");
           }
           else if(x<y)
           {
               System.out.println("<");  
           }
           else
                System.out.println("=");
        }
    }
    
}