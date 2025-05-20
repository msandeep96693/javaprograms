package Programs2;

public class fetch_of_the_vowels {

	public static void main(String[] args) {
		
	String name = "sandeeprywerhdfhsdj";
	int count = 0;
	
	for(int i = 0; i<= name.length()-1; i++)
	{
		char ch = name.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
		{
			System.out.println(ch);
			count++;
		}
	}
		System.out.println(count);
	}

}
