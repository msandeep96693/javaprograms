package Programs;

public class Count_number_of_character_in_a_String {

	public static void main(String[] args) {
		
		String a ="aaabbbccceddggpogypheirghfhgd";
		
		int count = 0;
		for(int i = 0; i<= a.length()-1; i++)
		{
				char ch = a.charAt(i);
				if(ch=='a' || ch=='e' || ch =='i' || ch=='o' || ch=='u')
				{
					System.out.println("character are :- "+ ch);
					count++;	
				} 
		}	
		System.out.println(count);
	}
}
