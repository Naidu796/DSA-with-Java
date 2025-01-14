class null_index_value
{
	public static void main(String[] args)
	{
		String[] a=new String[5];
		a[0]="Hello";
		a[1]=null;
		a[2]="naidu";
		a[3]="bigg";
		a[4]=null;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==null)
			{
				System.out.println(i);
			}
		}
		for(String a1:a)
		{
			System.out.println(a1);
		}
	}
}
		
