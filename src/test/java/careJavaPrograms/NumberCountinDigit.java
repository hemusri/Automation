package careJavaPrograms;
public class NumberCountinDigit
{
	public static void main(String[] args)
	{
		int number = 543211;
		int noOfDigits = 0;
		while(number !=0)
		{
			number = number/10;
			noOfDigits++;
		}
		System.out.println("Number of digits in given number are :" +noOfDigits);
	}
}