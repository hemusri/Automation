package interviewQuctions;

public class Stringcode {

	public static void main(java.lang.String[] args)
	{
		String s1= "Code";//String Constant pool  //literals
		String s2="Code";
		System.out.println(s1==s2);//ture
		String s3 = new String("Code");  //heap area and string constatnt pool
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		

	}

}
