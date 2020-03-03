import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for (int i = 0; i < n; i++) {
        int a=input.nextInt(),b=input.nextInt();
                if(a<b){
                System.out.println("<");
            }
            else if (a>b) {
                System.out.println(">");
            }
            else
                System.out.println("=");
         
        }
    }
}