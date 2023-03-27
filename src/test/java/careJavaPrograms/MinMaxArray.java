package careJavaPrograms;
public class MinMaxArray
{
	public static void main(String[] args)
	{
		int[] arr = {2,3,5,7,9};
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		for (int value : arr) 
		{
			if (value > maxValue)
			{
				maxValue = value;
			}
			if (value < minValue) 
			{
				minValue = value;
			}
		}
		System.out.println("Min Value: " + minValue);
		System.out.println("Max Value: " + maxValue);
	}
}