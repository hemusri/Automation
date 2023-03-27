package careJavaPrograms;
//import java.util.Scanner;

public class PalindromeNumberWWSC
{
	public static void main(String[] args)
	{
		/*Scanner s =new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();*/
		int n = 1221;
		int r = 0;
		int sum = 0;
		int temp = n;
		
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;	
	}
		System.out.println(sum);
	
	if(temp==sum)
	{
		System.out.println("Given number is palindrome");
	}
	else
	{
		System.out.println("Given number is not palindrome");	
	}
	}
}