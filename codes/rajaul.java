import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n;
      n=s.nextInt();
      int a,b;
         for (int i = 0; i <n; i++) {
             a=s.nextInt();
             b=s.nextInt();
         
         if(a<b)
             System.out.println("<");
         else if(a>b)
             System.out.println(">");
         else System.out.println("=");
     
     }
    } 
}