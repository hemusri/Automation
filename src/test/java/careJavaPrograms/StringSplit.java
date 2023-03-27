package careJavaPrograms;
public class StringSplit
{
	public static void main(String[] args) 
	{
		String s1 = "RBG Technologies";
		
		int charCount = s1.length();
		System.out.println(charCount);

		char charArray[] = s1.toCharArray();
		System.out.println(charArray);

		String strArray[] = s1.split("o");
		System.out.println(strArray.length);
		
		char c1 = s1.charAt(2);
		System.out.println(c1);
		
		System.out.println(s1.replace("o","Y"));
		
		System.out.println(s1.split("g",3)[1]);

		System.out.println(s1.substring(5,11));
	}
}