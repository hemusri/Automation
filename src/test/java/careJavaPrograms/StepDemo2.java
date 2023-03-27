package careJavaPrograms;
public class StepDemo2
{
	public static void main(String[] args)
	{
		int k =2;
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<1+i; j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+2;
			}
			System.out.println("");
		}
	}
}