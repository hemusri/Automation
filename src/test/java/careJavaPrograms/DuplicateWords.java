package careJavaPrograms;
import java.util.HashMap;

public class DuplicateWords
{
	public static void main(String[] args)
	{
		String names = "Malli Arjun Siva Siva Arjun Malli Arjun Siva Siva Siva";
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		String[] s=names.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			if(hm.get(s[i])!=null)                      
			{                                        
				hm.put(s[i],hm.get(s[i])+1);               
			}                                        
			else                                     
			{
				hm.put(s[i],1);
			}
		}
		System.out.println(hm);
	}
}