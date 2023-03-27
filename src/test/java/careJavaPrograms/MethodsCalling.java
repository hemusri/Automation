package careJavaPrograms;
public class MethodsCalling
{
	public static void main(String[] args)
	{
		MethodsCalling mc1 = new MethodsCalling();
		String name = mc1.Data1();
		System.out.println(name);//calling return from non static method with using variable name 
		
		System.out.println(mc1.Data1());//calling return from non static method without using variable name 
		
		String abc = Data2();
		System.out.println(abc);//calling return from static method	
		
//		System.out.println(Data2());
	}
	
	public String Data1()
	{
		System.out.println("My name is Arjun");
		return "Arjun";
	}
	public static String Data2()
	{
		System.out.println("My name is Arjun");
		return "Arjun";
	}
}