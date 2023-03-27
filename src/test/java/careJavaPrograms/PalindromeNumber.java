package careJavaPrograms;
public class PalindromeNumber 
{	    
	public static void main(String[] args) 
	{
		int num = 12321; // input number to check
		if (isPalindrome(num)) 
		{
			System.out.println(num + " is a palindrome number");
		}
		else 
		{
			System.out.println(num + " is not a palindrome number");
		}
	}

	// method to check if a number is palindrome or not
	public static boolean isPalindrome(int num)
	{
		if (num < 0 || (num != 0 && num % 10 == 0)) 
		{
			return false;
		}
		int reverse = 0;
		while (num > reverse) 
		{
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}
		return (num == reverse || num == reverse / 10);
	}
}