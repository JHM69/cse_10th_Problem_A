import java.util.Scanner;
public class Main {
    public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int n,a,b,i;
   
    n=input.nextInt();
    for(i=1;i<=n;i++)
    {
        a=input.nextInt();
        b=input.nextInt();
        if(a>b)
        {
            System.out.println(">");
        }
        else if(a<b)
        {
             System.out.println("<");
        }
        else
           System.out.println("="); 
    }
}
}