package careJavaPrograms;
public class MinMaxNumber 
{
	public static void main(String[] args)
	{
		int[] a = {71,32,43,14,25};
		
		for(int i=0;i<a.length;i++)
		{int min=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(min==a[i])
				{
					min = a[i];
					a[i] = a[j];
					a[j] = min;
				}
			}
		}
		System.out.println(a[0]);
		System.out.println(a[4]);
	}
}