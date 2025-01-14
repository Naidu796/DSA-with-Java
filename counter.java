// up down couner
//iteration loops    while, for , do-while, for each
import java.util.Scanner;
class counter
{
	public static void main(String[] args)
	{
		int count,enable;
		count=0;
		Scanner s=new Scanner(System.in);
		enable=s.nextInt();
		if(enable==1)
		{
			System.out.println(count);
			count=count+1;
		}
		else
		{
			System.out.println(count);
			count=count-1;
		}
	}
}
		
			
		
