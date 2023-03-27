package careJavaPrograms;
public class StringWordsCount
{
	public static void main(String[] args)
	{
		String words = "My name is Siva";
		int countWords = words.split("\\s").length;
		System.out.println("The words in given String : "+countWords);
	}
}