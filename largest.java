import java.util.Scanner;
class larger
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a,b,c,larger;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b & a>c)
		{
			larger=a;
		}
		else if(b>a & b>c)
		{
			larger=b;
		}
		else
		{
			larger=c;
		}
		System.out.println("larger number is : "+larger);
	}
}
