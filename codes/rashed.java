import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int t,i,a,b;
        t=in.nextInt();
        for(i=1;i<=t;i++){
            a=in.nextInt();
            b=in.nextInt();
            if(a>b){
                System.out.println(">");
            }
            else if(a<b){
                System.out.println("<");
            }
            else{
                System.out.println("=");
            }
        }
    }
}