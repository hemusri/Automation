package careJavaPrograms;
public class StaticMethodDemo 
{
	int rollno;
	String name;
	static String college="SBIT";
	
	static void change()
	{
		college = "SBCE";
	}
	
    StaticMethodDemo(int r,String n)
	{
		rollno = r;
		name = n;
	}
	
	void show()
	{
		System.out.println(rollno+name+college);
	}
	
	public static void main(String[] args)
	{
		StaticMethodDemo.change();
		StaticMethodDemo s1 = new StaticMethodDemo(37,"indhu");
		StaticMethodDemo s2 = new StaticMethodDemo(38,"sindhu");
		StaticMethodDemo s3 = new StaticMethodDemo(39,"bindhu");
		
		s1.show();
		s2.show();
		s3.show();
	}
}