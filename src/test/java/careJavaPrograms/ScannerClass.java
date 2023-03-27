package careJavaPrograms;
import java.util.Scanner;

public class ScannerClass
{
	public static void main(String[] args) 
	{
		/* Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");

	    // String input
	    String name = myObj.nextLine();

	    // Numerical input
	    int age = myObj.nextInt();

	    double salary = myObj.nextDouble();

	    // Output input by user
	    System.out.println("Name: "+name);
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary);*/

		/*	    int x, y, sum;
	    Scanner myObj = new Scanner(System.in); // Create a Scanner object
	    System.out.println("Type a number:");
	    x = myObj.nextInt(); // Read user input

	    System.out.println("Type another number:");
	    y = myObj.nextInt(); // Read user input

	    sum = x + y;  // Calculate the sum of x + y
	    System.out.println("Sum is: " + sum); // Print the sum*/

		/*int x, y, temp;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before Swapping : " + x + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping : " + x + y);*/
		
		int x, y;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	  
	      x = in.nextInt();
	      y = in.nextInt();
	  
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	  
	      x = x + y;
	      y = x - y;
	      x = x - y;
	  
	      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);	   
	}
}