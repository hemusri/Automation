package careJavaPrograms;
public class SortArrayDemo
{
  public static void main(String[] args)
	{
		int a[] = {1,5,2,6,8,3,4,9,7};
		int b;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;		
				}
			}
		}	
		
		for (int i=0; i<a.length; i++)
		{
			/*if(a[i]==a.length)//for remove max number in single digit array
			{
			continue;
			}*/
			/*if(a[i]==5)//for remove particular numberin array
			{
			continue;
			}*/
			System.out.println(a[i]);
		}
	}	
}