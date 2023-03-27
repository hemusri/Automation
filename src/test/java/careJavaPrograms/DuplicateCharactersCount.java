package careJavaPrograms;
import java.util.HashMap;

public class DuplicateCharactersCount 
{
	public static void main(String[] args) 
	{
		String str = "Hello friend";
		HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
		for (int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if (charCount.containsKey(ch)) 
			{
				charCount.put(ch, charCount.get(ch) + 1);
			} 
			else
			{
				charCount.put(ch, 1);
			}
		}
		for (char ch : charCount.keySet())
		{
			if (charCount.get(ch) > 1)
			{
				System.out.println("Duplicate character is : "+ch + " and the count is : " + charCount.get(ch));
			}
		}
	}
}