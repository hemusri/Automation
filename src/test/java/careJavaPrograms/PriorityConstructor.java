package careJavaPrograms;
public class PriorityConstructor 
{
	int i = 1;
	static int s = 2;
	String s1 = "corejava";

	PriorityConstructor(int i)
	{
		System.out.println(i);
		/*i=i; // RHS i is refers to local variable & LHS i is refers to non static variable
	   System.out.println(i);*/
		i=3;
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		PriorityConstructor pc = new PriorityConstructor(2);
		System.out.println(pc.i);
		System.out.println(s);
		System.out.println(pc.s1);
	}
}