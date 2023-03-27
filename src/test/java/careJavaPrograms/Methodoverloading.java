package careJavaPrograms;
public class Methodoverloading
{	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(boolean a,boolean b)
	{
		System.out.println(a);
	}
	
	public void getData(int a,int b,int c)
	{
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		Methodoverloading mol = new Methodoverloading();
		mol.getData("We are all got jobs as soon as possible");
		mol.getData(true, false);
		mol.getData(10,20,30);
	}
}