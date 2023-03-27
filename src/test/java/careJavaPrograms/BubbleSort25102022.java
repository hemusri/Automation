package careJavaPrograms;
public class BubbleSort25102022 
{
	public static void main(String[] args) 
	{
		int a[] = {1,5,3,2,4};
		int b;       
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}	
	}
}