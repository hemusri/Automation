package careJavaPrograms;
public class MultipleOfNumberArray 
{
	public static void main(String[] args)
	{
		int[] a  = {2,6,12,15,20,25};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			/*else
			{
				System.out.println(a[i]+" is not multiple of 2");
			}*/
		}
	}
}