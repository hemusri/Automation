package careJavaPrograms;
public class StringBufferDemo
{
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("WELCOME");//StringBuffer is a predefined class in java.lang package,it is used for to overcome the drawback of String 
		System.out.println(str);
		
/*		//To add to String
		System.out.println(str.append(" to JAVA"));
      
		//To insert in String from particular place
		System.out.println(str.insert(4,"HOW"));

		//To delete in String from particular place to another place
		System.out.println(str.delete(4,7));

		//To reverse the string
		System.out.println(str.reverse());

		//To find the length of the String
		System.out.println(str.length());

		System.out.println(str.reverse());

		System.out.println(str.indexOf("WELCOME"));

		System.out.println(str.charAt(6));

		//To print the String from given particular value
		System.out.println(str.substring(8));

		//To print in String from particular place to another place
		System.out.println(str.subSequence(10,15));//(10,16)StringIndexOutOfBoundsException

		System.out.println(str);*/
	}
}