package careJavaPrograms;
public class Variables
{
	int a = 10;//instance or non static variable
	static int b = 20;//static variable
//	int a = 30; duplicate non-static variable
	
	//Based on declaration place we categorized variables are two types.
	//Variables are mainly two types. They are 1.Global & 2.Local variables.
	//Again Global variables are declared as two types, They are 1.Static & 2.Non static or Instance Variables.
	public static void main(String[] args)
	{
		int a = 40;//Local variable
		System.out.println(a);
		
//		int a = 50; duplicate local variable
		a =60;//Local variable value reinitialised 
		System.out.println(a);
		
		b=100;//static variable value reinitialised
		
		Variables v = new Variables();//v is an object used to store non static variables
		System.out.println(b);
	    System.out.println(v.a);
	}
}