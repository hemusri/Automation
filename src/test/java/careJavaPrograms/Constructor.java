package careJavaPrograms;
public class Constructor 
{
	int i = 10;
	static int s = 20;
	
	Constructor()
	{
		s=i;
	}
	
	Constructor(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		System.out.println(s);
		
		Constructor c1 = new Constructor();
		System.out.println(s);
		System.out.println(c1.i);
		
		Constructor c2 = new Constructor(30,40);
		System.out.println(c2.i);
	}
}