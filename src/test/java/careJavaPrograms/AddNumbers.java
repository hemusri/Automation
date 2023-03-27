package careJavaPrograms;

public class AddNumbers 
{
//	int c = 10;
	void addNumbers()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}	
	void addNumbers2(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	//Write a program to add any two numbers?
	public static void main(String[] args) 
	{
		AddNumbers add = new AddNumbers();
	    add.addNumbers();
	    add.addNumbers2(30,40);	    
//		System.out.println(add.c);
	}
}