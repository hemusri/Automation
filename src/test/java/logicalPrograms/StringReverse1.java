package logicalPrograms;
public class StringReverse1 
{

	public static void main(String[] args)
	{
		String str = "polaboina naresh";

		String reverse = "";

		int length = str.length();

		for (int i = 0; i < length; i++) {

		     reverse = str.charAt(i) + reverse;

		}

		System.out.println(reverse);
		
		if(str.equals(reverse))
		{
			System.out.println("Palindrome String");
		}
		else
			System.out.println("Not A palindrome String");

	}

}
