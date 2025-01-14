//static,instance, local, global(static)
class variables
{
	static int static_var=56; // call everywhere entire program
	void display()
	{
		int local_var=20;
		System.out.println(local_var);
		
		//return 0;	 give it for int,float method
	}
	public static void main(String[] arg)
	{
		int instance=10;
		variables v= new variables();
		System.out.println(instance);
		v.display();
		System.out.println(static_var);
		
		//System.out.println(local_var);	
	}
}
