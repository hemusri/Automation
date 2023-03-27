package careJavaPrograms;
public class DataTypes
{
//	Data types are divided into two groups:
//	Primitive data types - includes byte, short, int, long, float, double, char and boolean
//	Non-primitive data types - such as String, Arrays and Classes
	
	int myNum = 5;               // Integer (whole number)
	float myFloatNum = 5.99f;    // Floating point number
	char myLetter = 'D';         // Character
	boolean myBool = true;       // Boolean
	String myText = "Hello";     // String
	
	public static void main(String[] args)
	{
		long num = 15000000000L;
		System.out.println(num);
		
//		Note that you should end the value with an "f" for floats and "d" for doubles:
		float myNum = 5.75f;
		System.out.println(myNum);
		double number = 19.99d;
		System.out.println(number);
		
//		The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. 
//		Therefore it is safer to use double for most calculations.
		
//		A floating point number can also be a scientific number with an "e" to indicate the power of 10:
		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);
	}
}