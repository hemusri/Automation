package careJavaPrograms;
public class LastNumberArray
{
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4, 5};
		int n = a.length;
		int[] tempArray = new int[n];
		tempArray[0] = a[n-1];
		
		for (int i=0; i<n-1; i++)
		{
			tempArray[i+1] = a[i];
		}

		for (int i=0; i<n; i++) 
		{
			System.out.print(tempArray[i] + " ");
		}
	}
}