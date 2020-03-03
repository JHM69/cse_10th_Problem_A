import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		int i,t;
		long num1,num2;

		t=so.nextInt();
		for(i=1;i<=t;i++)
		{
		num1=so.nextLong();
		num2=so.nextLong();
		if(num1==num2)
			System.out.println("=");
		else if(num1<num2)
			System.out.println("<");
		else
			System.out.println(">");
		}

	}

}