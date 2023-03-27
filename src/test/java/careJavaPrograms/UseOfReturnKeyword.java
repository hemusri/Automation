package careJavaPrograms;
public class UseOfReturnKeyword
{
	public static void main(String[] args)
	{
//		UseOfReturnKeyword.funA(100);
		System.out.println(funA(1000));
	}
	public static int funA(int a)
	{
		System.out.println("This is return program");
		return 10;
	}
}