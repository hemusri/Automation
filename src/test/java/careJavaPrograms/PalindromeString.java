package careJavaPrograms;
public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String str = "racecar"; // example string

		// convert string to lowercase
		str = str.toLowerCase();

		// iterate over half the string to check for palindrome
		boolean isPalindrome = true;
		for (int i = 0; i < str.length() / 2; i++) 
		{
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) 
			{
				isPalindrome = false;
				break;
			}
		}

		// print the result
		if (isPalindrome)       
		{
			System.out.println(str + " is a palindrome.");
		}
		else 
		{
			System.out.println(str + " is not a palindrome.");
		}
	}
}