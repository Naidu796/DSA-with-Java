//iteration loops    while, for , do-while, for each
import java.util.Scanner;
class while_loop
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int x; //String S;
		float f;
		//S=s.nextLine();
		f=s.nextFloat();
		x=s.nextInt();
		while(x>0  & f>0)
		{
			System.out.println(x);
			System.out.println(f);
		//	System.out.println(S);
			x--;
			f++;
		}
	}
}
