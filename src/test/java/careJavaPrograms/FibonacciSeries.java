package careJavaPrograms;
public class FibonacciSeries 
{
	/*public static void main(String[] args)
	{
		int n = 10; // number of terms to print
		int a = 0, b = 1, c;
		System.out.print("Fibonacci series up to " + n + " terms: ");
		// calculate and print the Fibonacci series
		for (int i = 3; i <= n + 2; i++) 
		{
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}*/
	
	public static void main(String[] args) 
	{
		int num=10, firstNum=0, secondNum=1;
		for(int i=2;i<num+2;i++)
		{
			System.out.println(firstNum+" ");
			int nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;	
		}
	}
}