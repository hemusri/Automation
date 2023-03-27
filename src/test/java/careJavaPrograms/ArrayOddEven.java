package careJavaPrograms;
public class ArrayOddEven
{
	public static void main(String[] args)
	{
		int[] a ={8,7,6,5,4,3,2,1};
//		System.out.println(a.length);
//		System.out.println("\t");
		for(int i =1;i<=a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}	
	    }
//		System.out.println("\t");
		for(int i =1;i<=a.length;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}	
	    }		
     }
}