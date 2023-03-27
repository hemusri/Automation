package careJavaPrograms;
//import java.util.Scanner;

public class PrimeNumbersConcept
{
	public static void main(String[] args) 
	{
		/*for(int i=0;i<=20;i++)
		{
			int c = 0;
			for(int j=1;j<=i;j++)
			{
			   if(i%j==0)
			   {
				 c++;
		   	   }	
			}
		    if (c==2)
		    {
			System.out.println(i);
		    }
		}*/
		
		int n = 15;
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();*/
		
		int count = 0;
		for(int i=1;i<=n;i++)
		{
		   if(n%i==0)
		   {
			 count++;
	   	   }	
		}
	    if(count==2)
		    System.out.println("Given number is " +n+" and it is prime number");
	    else
			System.out.println("Given number is "+n+" and it is not prime number");
	}
}