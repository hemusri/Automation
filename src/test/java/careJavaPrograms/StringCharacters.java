package careJavaPrograms;
public class StringCharacters 
{
	public static void main(String[] args) 
	{
		String s = "ARJUN batch is 26";
		//System.out.println("The given String is : "+s);

		for(int i=0;i<s.length();i++)
		{
			//To print String in separate line
			char c = s.charAt(i);
			System.out.print(c);
		}

		//To print ASCII code of each character of String
		//System.out.println(c+""+(int)c);

		//To print UPPERCASE characters of String
		/*if(Character.isUpperCase(c))
			{
				System.out.println(c);
			}*/

		//To print LOWERCASE characters of String
		/*if(Character.isLowerCase(c))
			{
				System.out.println(c);
			}*/

		//To print Digits of String
		/*if(Character.isDigit(c))
			{
				System.out.println(c);
			}*/

		//To print Letters and Digits of String
		/*if(Character.isLetterOrDigit(c))
			{
				System.out.println(c);
			}*/		
	}
}