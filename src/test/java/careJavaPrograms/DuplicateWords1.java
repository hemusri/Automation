package careJavaPrograms;
import java.util.HashMap;

public class DuplicateWords1
{
	public static void main(String[] args)
	{
		String names = "Malli Arjun Siva Siva Arjun Malli Arjun Siva Siva Siva ";
		String[] split = names.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();

		for (int i=0; i<split.length; i++) 
		{
			if (map.containsKey(split[i]))
			{
				int count = map.get(split[i]);
				System.out.println(count);
				map.put(split[i], count+1);
			}
			else
			{
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}
}