package careJavaPrograms;
public class MinAndMaxNuminMatrix
{
	public static void main(String[] args) 
	{
		int Min[][] = {{4,2,3},{1,5,6},{7,8,9}};
		int min = Min[0][0];

		for(int i=0;i<Min.length;i++)
		{
			for(int j=0;j<Min.length;j++)
			{
				if(min>Min[i][j])
				{
					min = Min[i][j];
				}
			}
		}
		System.out.println(min);
	}
}