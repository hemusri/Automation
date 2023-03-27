package careJavaPrograms;
public class Arithmetic
{
	public static void main(String[] args) 
	{
		Arithmetic ao=new Arithmetic();
		ao.arithmetic();
	}	
	void arithmetic()
	{
		int a = 10;
		int b = 5;
		int addNum = a+b;
		System.out.println(addNum);
		
		int subNum = a-b;
		System.out.println(subNum);
		
		int mulNum = a*b;
		System.out.println(mulNum);
		
		int divNum = a/b;
		System.out.println(divNum);	
	}
}