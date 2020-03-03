import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,t,i;
        t=input.nextInt();
        for(i=1;i<=t;i++)
        {
        a=input.nextInt();
        b=input.nextInt();
        if(a==b)
        System.out.println('=');
        else if(a>b)
            System.out.println('>');
        else
            System.out.println('<');
            }
    }
    
}