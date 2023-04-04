package week7.day2;
//position of each character in a string
import java.util.HashMap;
import java.util.Map;

public class LearnMap {
	public static void main(String[] args) {
		
		String str="Sandhiya";
		int s=str.length();
		
		Map<Character,Integer> m=new HashMap<Character, Integer>();
		//convert string to chararray
		char[] a=str.toCharArray();
		//iterate the values
		for(char d:a)
		{
			if(m.containsKey(d))
			{
				m.put(d,m.get(d)+1);
				
			}
			else
			{
				m.put(d, 1);
			}
		}
		
		System.out.println("characters list:" +m);
		
	}

}
