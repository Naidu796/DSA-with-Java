import java.util.Scanner;
class larger
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a,b,c,largest;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				largest=a;
			}
			else{
				largest=c;
			}}
		else{
			if(b>c)
			{
				largest=b;
			}
			else
			{
				largest=c;
			}
		}
		System.out.println("the largest number is : "+largest);
	}
}
