package careJavaPrograms;
public class StringPalindromeornot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str, rev="";

		System.out.println("Enter a string:");
		str = sc.nextLine();

		int len = str.length();

		for(int i=len-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println(str+" is a palindrome");
		} 
		else 
		{
			System.out.println(str+" is not a palindrome.");
		}
	}
}