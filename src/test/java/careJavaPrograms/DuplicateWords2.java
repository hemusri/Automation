package careJavaPrograms;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWords2 
{
	public static void main(String[] args)
	{
		String input = "Hello World! Hello World! Java is great. Java is great.";
		String[] words = input.split("\\s+");

		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();

		for (String word : words) 
		{
			if (wordCount.containsKey(word)) 
			{
				wordCount.put(word, wordCount.get(word) + 1);
			} 
			else 
			{
				wordCount.put(word, 1);
			}
		}

		for (Map.Entry<String, Integer> entry : wordCount.entrySet())
		{
			if (entry.getValue() > 1) 
			{
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}