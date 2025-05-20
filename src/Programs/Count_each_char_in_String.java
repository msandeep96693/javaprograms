package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Count_each_char_in_String {

	public static void main(String[] args) {
		
		String s1="Shiva";
		char ch;
		int count=0;
		HashMap<Character,Integer> h = new HashMap<Character, Integer>();
		
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			System.out.println("ch :-"+ch);
			
			ArrayList<Object> A = new ArrayList<>();
			A.add(ch);
			
			System.out.println("A :- "+A);
			
			count = (int) A.get(ch);
			count++;
			System.out.println("count :- "+count);
		}
		

	}

}
