// Java.lang.String:-
// String is used to represent group of characters or character array enclosed with in the double quotes.
import java.lang.*;  // java.lang.String
class string_buffer
{
	public static void main(String[] args)
	{
		String str3,str4,s5,s6,s7,s8,s9;
		String str="Hello_Naidu";
		System.out.println(str);
		String str1=new String("jack sparrow");
		System.out.println(str1);
		StringBuffer str2 = new StringBuffer("john");
		System.out.println(str2);
		str3=str.replace("N","appala n");
		str4=str.toUpperCase();
		System.out.println(str3+"  "+str4);
		s5=str3.appends(str4);
		s6=str3.equlasIgnoreCase(str4);
		System.out.println(s5);
		System.out.println(s6);
		
		
	}
}

