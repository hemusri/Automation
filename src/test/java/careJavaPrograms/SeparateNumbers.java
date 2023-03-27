package careJavaPrograms;{
	public static void main(String[] args) 
	{
		int[] arr = {-1, 4, -2, 3, -3, 2, -4, 1};
		int n = arr.length;

		int[] neg = new int[n]; // array to store negative numbers
		int[] pos = new int[n]; // array to store positive numbers
		int negIndex = 0, posIndex = 0;

		// separate the negative and positive numbers
		for (int i = 0; i < n; i++)
		{
			if (arr[i] < 0) 
			{
				neg[negIndex++] = arr[i];
			} 
			else
			{
				pos[posIndex++] = arr[i];
			}
		}

		// print the negative numbers
		System.out.print("Negative numbers: ");
		for (int i = 0; i < negIndex; i++) 
		{
			System.out.print(neg[i] + " ");
		}

		// print the positive numbers
		System.out.print("\nPositive numbers: ");
		for (int i = 0; i < posIndex; i++) 
		{
			System.out.print(pos[i] + " ");
		}
	}
}