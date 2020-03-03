public class Main{
    public static void main(String[] args) {
        int a,b,i,n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=0;i<n;i++)
        {
            a=input.nextInt();
            b=input.nextInt();
            if(a>b)
                System.out.println(">");
            else if(a<b)
                System.out.println("<");
            else
                System.out.println("=");
        }
        
    }
    
}