package Programs2;

public class Fetch_no_vowels {

	public static void main(String[] args) {
		
		String a = "sadfgaisrgpirewugsajdvbdoreiytweor";
		
		for(int i = 0; i<= a.length()-1; i++)
		{
			char ch = a.charAt(i);
			if(ch!='a' || ch!='e' || ch!='o' || ch!='u' || ch!='i')
			{
				System.out.println(ch);
			}
		}

	}

}
