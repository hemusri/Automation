package careJavaPrograms;
public class StringReverseInAll 
{
	public static void main(String[] args)
	{
		String originalString = "this is rbg exam";
		String[] s1=originalString.split(" ");

		for(int i=0;i<s1.length;i++)
		{		
			String s2 = s1[i];
			String r = "";
			for(int j=0;j<s2.length();j++)
			{
				r=s2.charAt(j)+r;				
			}
			System.out.println(r);	
		}

/*		String reverseString = "";

		for(int k=0;k<originalString.length();k++)
		{
			reverseString = originalString.charAt(k)+reverseString;
		}
		System.out.println(reverseString);*/
	}
		
	
		
}