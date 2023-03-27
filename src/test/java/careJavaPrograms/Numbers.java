package careJavaPrograms;
public class Numbers
{
	public static void main(String[] args) 
	{
		/*//for(intialization,condtion statement,increment/decrement);
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}*/
		
		Numbers wol = new Numbers();
		wol.funA(1);
		
//		funA(1);
	}
    
	public void funA(int a)
	{
		if(a<=10)
		{
		System.out.println(a);
		funA(a+1);
		}
	}
}