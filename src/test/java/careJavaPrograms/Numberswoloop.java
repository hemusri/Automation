package careJavaPrograms;
public class Numberswoloop
{
public static void funA(int a)// or void funA(int a)
{
	if(a<=10)
	{
	System.out.println(a);
	funA(a+1);
	}	
}
	public static void main(String[] args) 
	{
		/*Numberswoloop n=new Numberswoloop();
		n.funA(1);*/
		funA(1);		
	}
}