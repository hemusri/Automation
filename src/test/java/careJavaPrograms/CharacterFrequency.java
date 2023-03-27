package careJavaPrograms;
public class CharacterFrequency 
{
	public static void main(String[] args) 
	{
		String str = "Welcome to TATA CONSULTANCCY SERVICES";
		int[] freq = new int[256]; // array to store frequency of each character

		for (int i = 0; i < str.length(); i++) // iterate through each character in the string and update frequency count
		{
			char ch = str.charAt(i);
			freq[ch]++;
		}

//		System.out.println("Character Frequency:");
		for (int i = 0; i < str.length(); i++) 		// print frequency of each character
		{
			if (freq[i] > 0)
			{
				System.out.println((char) i + " : " + freq[i]);
			}
		}
	}
}