import java.util.Scanner;


public class Main{


    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int n,x,i,a=0,b=0;
        x=input.nextInt();
        for(i=1;i<=x;i++){
        
            a=input.nextInt();
            b=input.nextInt();
        
        if(a>b)
        {
            System.out.println(">");}
        else if(a<b){
            System.out.println("<");}
        else
            System.out.println("=");
        }

    }
    
}