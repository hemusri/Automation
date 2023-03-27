package careJavaPrograms;
public class StringConcept //String is an object which represents sequence of characters
{
	public static void main(String[] args)
	{
		//This is the first way to declare a String and it is called as STRING LITERAL
		//In String literal,same multiple values with same name then it won't create new object,it will refer to existing
		String s1 = "My name is Siva";
		String s2 = "My name is Siva";
		System.out.println(s1);
		System.out.println(s2);

		//This is the second way to declare a String using new memory allocating operator
		//In this if it is a same String value it will still explicitly create new object in the memory space
		String s3 = new String("My job is Software Engineer");
		String s4 = new String("My name is Siva");
		System.out.println(s3);
		System.out.println(s4);

		String[] splittedstring = s3.split("is");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
//		System.out.println(splittedstring[2]);

//		System.out.println(splittedstring[1].trim());

		//If we print character by character in order then prefer Stringname.charAt(index)
		//for(int i=0; i<Stringname.length(); i++)
/*		for(int i=0; i<s3.length(); i++)
		{
			System.out.print(s3.charAt(i));
		}*/

		//Print String in reverse order 
		//for(int i=StringName.length()-1; i>=0; i--)
/*		for(int i=s3.length()-1; i>=0; i--)
		{
			System.out.print(s3.charAt(i));
		}*/
	}
}