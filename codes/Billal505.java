import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
          
      Scanner input=new Scanner(System.in);
      int a,b,c;
      a=input.nextInt();
      for(int i=1;i<=a;i++){
           b=input.nextInt();
       c=input.nextInt();
        if(b>c)
              System.out.println(">");
        else if(b==c)
              System.out.println("=");
        else System.out.println("<");
      }
    }
}