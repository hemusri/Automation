package careJavaPrograms;
public class Variables1
{
	public static void main(String[] args)
	{
//		If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable 
//		as "final" or "constant",which means unchangeable and read-only)
	    final int num = 30;
	    System.out.println(num);
//	    num = 40; // will generate an error: cannot assign a value to a final variable:
	    
//	    To combine both text and a variable, use the + character:
	    String name = "Siva";
	    System.out.println("Hello " + name);
	    
//	    You can also use the + character to add a variable to another variable:
	    String firstName = "Arjun ";
	    String lastName = "Prasad";
	    String fullName = firstName + lastName;
	    System.out.println(fullName);
	    
//	    To declare more than one variable of the same type, you can use a comma-separated list:
	    int a=10,b=20,c=30;
	    System.out.println(a+b+c);
	    
//	    You can also assign the same value to multiple variables in one line:
	    int x, y, z;
	    x = y = z = 50;
	    System.out.println(x + y + z);
	    
//	    The general rules for naming variables are:
//	    	Names can contain letters, digits, underscores, and dollar signs
//	    	Names must begin with a letter
//	    	Names should start with a lowercase letter and it cannot contain whitespace
//	    	Names can also begin with $ and _ 
//	    	Names are case sensitive ("myVar" and "myvar" are different variables)
//	    	Reserved words (like Java keywords, such as int or boolean) cannot be used as names
	}
}