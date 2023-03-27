package careJavaPrograms;
public class MatrixExample
{
	public static void main(String[] args) 
	{
		// Create a 3x3 matrix
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		// Print the middle number
		int middle = matrix[1][1];
		System.out.println("The middle number is: " + middle);
	}
}