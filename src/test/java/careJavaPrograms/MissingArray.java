package careJavaPrograms;
public class MissingArray
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,7};   
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of the numbers without missing number :"+sum1);
		
		int[] b={1,2,3,4,5,6,7};   
		int sum2=0;
		for(int i=0;i<b.length;i++)
		{
			sum2=sum2+b[i];
		}
		System.out.println("Sum of the numbers with missing number :"+sum2);
		System.out.println("Missing number is :"+(sum2-sum1));
		/*int total_num;
		//int[] numbers ={1,2,3,4,6,7};
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,10};
		total_num = 10;
		int expected_num_sum = total_num * ((total_num + 1)) / 2;
		System.out.println(expected_num_sum);
		int num_sum = 0;
		//for (int i: numbers)
		for(int i=0;i<numbers.length;i++)
		{
			num_sum = num_sum+numbers[i];
		}
		System.out.println(num_sum);
		System.out.println( expected_num_sum - num_sum);
		System.out.print("\n");*/
	}   }