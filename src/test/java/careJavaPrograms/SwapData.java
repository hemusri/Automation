package careJavaPrograms;
public class SwapData 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		/*int c = b;
		b=a;
		a=c;
		System.out.println(a);
		System.out.println(b);*/
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);		
	}
}