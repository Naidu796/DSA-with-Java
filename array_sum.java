class array_sum
{
public static void main(String[] args)
{
int[] a={10,20,30,40};
int sum=0;
int i;
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
System.out.println("Array Element sum up to "+i+" element is "+sum);
}
System.out.println("Final sum="+sum);
}
}

// another method
/*class Test
{
public static void main(String[] args)
{
int[] a={10,20,30,40};
int sum=0;
for(int a1:a)
{
sum=sum+a1;
}
System.out.println("Array Element sum is="+sum);
}
}*/
