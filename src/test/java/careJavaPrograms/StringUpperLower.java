package careJavaPrograms;
public class StringUpperLower
{
	public static void main(String[] args) 
	{
		String s = "My Name Is Siva";
		System.out.println(s);
		int upper = 0;
		int smaller = 0;
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			
			if(Character.isUpperCase(c))
				upper++;
			if(Character.isLowerCase(c))
				smaller++;
		}
		System.out.println("Upper case letters are : "+upper);
		System.out.println("Smaller case letters are : "+smaller);
	}
}