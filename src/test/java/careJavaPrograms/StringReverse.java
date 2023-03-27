package careJavaPrograms;
public class StringReverse 
{
	public static void main(String[] args)
	{
		String originalString = "this";
		System.out.println("Original String is : " +originalString);
		String reversedString = "";

		for(int i=0; i<originalString.length(); i++)
		{
			reversedString = originalString.charAt(i)+reversedString;	
		}

		/*for(int i=originalString.length()-1; i>=0; i--)
		{
			reversedString = reversedString +originalString.charAt(i);
		}*/
		System.out.println("Reveresd String is : " +reversedString);

		/*int time = 20;
		String result = (time < 18)?"Good day." :"Good evening.";
		System.out.println(result);*/ 
	}
}