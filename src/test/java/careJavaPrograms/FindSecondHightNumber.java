package careJavaPrograms;

public class FindSecondHightNumber {

	public static void main(String[] args)
	{

		
		int[] arr = {3, 7, 1, 8, 4, 2, 9, 5, 6};

		int max = arr[0];
		int secondMax = arr[0];

		for(int i=1;i<arr.length;i++)
		{
		    if(arr[i]>max)
		    {
		        secondMax = max;
		        max = arr[i];
		    }
		    else if(arr[i]>secondMax && arr[i]!=max)
		    {
		        secondMax = arr[i];
		    }
		}

		System.out.println("Second highest number is: "+secondMax);
	}

}
