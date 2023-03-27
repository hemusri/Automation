package careJavaPrograms;
public class StepDemo3
{

	public static void main(String[] args)
	{
        int k =3;
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<1+i; j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			System.out.println("");
		}
	}

}
