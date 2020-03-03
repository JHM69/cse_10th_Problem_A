public class Main {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     int num=input.nextInt();
   
    for( int i=1;i<=num;i++)
    {
    
        
          int  a=input.nextInt(),b=input.nextInt();
       
  
    if(a<b)
    {
       System.out.println("<"); 
    }
    else if(a>b)
    {
        System.out.println(">");
    }
     else 
       
    {
        System.out.println("=");
    }
}
    }

}