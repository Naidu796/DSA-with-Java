import java.util.*;
class user_array
{
	public static void main(String[] args)
	{
			int sum=0;
			Scanner s=new Scanner(System.in);
			int[] a=new int[5];
			for(int i=0;i<a.length;i++)
			{
				System.out.println("enter "+i+" value");
				a[i]=s.nextInt();
				sum=sum+a[i];
			}
			System.out.print("sum of these array values is "+sum);
			for(int j=0;j<a.length;j++)
			{	
				System.out.println("value in "+j+" position is "+a[j]);
			}
	}
}
				
