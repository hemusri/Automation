package programsNumbersPrint;

import java.util.Arrays;

public class Practie {

	public static void main(String[] args)
	{
		
		String s = "RacecaR";
	      s=s.toLowerCase();
		int size=s.length();
		String rev="";
		String originalvalue =s;
		
		for(int i=0; i<size; i++)
		{
			rev = s.charAt(i)+rev;
			
		}
		System.out.println(rev);
		
		if(originalvalue.equals(rev))
		{
			System.out.println("Palidram number");
		}
		else
		{
			System.out.println("Not A Palidram");
		}
		
	}
}