class array_max_min
{
	public static void main(String[] args)
	{
		//int min,max;
		int[] a={10,2,-2,30,5,60,2};
		int min=a[2];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("minimum value is : "+min);
		int max=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("max value is : "+max);
		
		// printitng array values
		for(int a1:a)
		{
			System.out.println(a1);
		}
	}
}
	
