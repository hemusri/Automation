package careJavaPrograms;
public class Loops 
{
	public static void main(String[] args) 
	{
//		Print i as long as i is less than 6.
		/*int i = 1;
		while(i < 6) 
		{
		  System.out.println(i);  
		  i++;
		}*/
		
//		Use the do/while loop to print i as long as i is less than 6.
		/*int i = 1;
		do
		 {
		  System.out.println(i);
		  i++;
		 }
		while(i < 6);*/
		
//		Loop through the items in the cars array.
		/*String[] cars = {"Volvo", "BMW", "Ford"};
		for(String i :cars) 
		{
		  System.out.println(i);
		}*/
		
//		Stop the loop if i is 5.
		for(int i = 0;i < 10;i++)
		{
		 if (i == 5)
		 {
	      break;
		 }
		 System.out.println(i);
		}
	
//		In the loop, when the value is "4", jump directly to the next value.
		for (int i = 0;i<10;i++)
		{
		  if(i == 4) 
		  {    
			continue;
		  }
		System.out.println(i);
		}
	}
}