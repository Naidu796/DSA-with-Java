//conditional/selectional statements if, if-else, nested if-else,switch
import java.util.Scanner;
class operators
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		if(a>100)
		{
			System.out.println("number is >100"+a);
		}
		else if (a<100)
		{
			System.out.println("number is <100");
		}
		else
		{
			System.out.println(a);
		}
	}
}
		
