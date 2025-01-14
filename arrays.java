// put brackets [] before camma only otherwise invalid
// every array in java is object, so create by using new operator
// user input array
import java.util.*;
class arrays
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter "+i+" value");
			//System.out.println(a[i]);
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of array values "+sum);
		for(int a1:a)
		{
			System.out.println("entered array vaue "+a1);
		}
	}
}
				

