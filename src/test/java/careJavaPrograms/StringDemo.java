package careJavaPrograms;
public class StringDemo 
{
	public static void main(String[] args) 
	{
		String str = new String(" Arjun");
		//Disadvantage of String : String class objects are immutable(can not modify on same location),if you assign the modification
		//to another object then it is acceptable 

 		//Here str is a variable name which indicates the String
		System.out.println(str);

		//To find the length of the String
		System.out.println(str.length());

		//To find the place of particular character 
		System.out.println(str.indexOf("j"));//index value of first character in given string

		//To find the character of given index 
		System.out.println(str.charAt(4));

		//To change the string name to upper case
		System.out.println(str.toUpperCase());

		//To change the string name to lower case
		System.out.println(str.toLowerCase());

		//To clear/cut the spaces before and after the String
		System.out.println(str.trim());

        //To concat two Strings
		str = str.concat(" Siva");
		System.out.println(str);
		
		/* //To compare two strings 
        System.out.println(str.compareTo("arjun"));
        /*0 : equal(unicode)
         positive : first mismatch of first string > first mismatch of second string (unicode)
         negative : first mismatch of first string < first mismatch of second string (unicode)

         0-9 : 48 to 57;
         A-Z : 65 to 90;
         a-z : 97 to 122*/
	}
}