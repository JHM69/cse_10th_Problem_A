import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t,i,a,b;
        t = input.nextInt();
        for(i=0;i<t;i++){
             a = input.nextInt();
             b = input.nextInt();
             if(a<b){
                 System.out.println("<");
             }
             if(a>b){
                 System.out.println(">");
             }
             if(a==b){
                 System.out.println("=");
             }
        }
    }
    
}