package Programs2;

public class Check_Polindrome_for_given_String 
{
	public static void main(String[] args) {
		
		String name = "SANDEEP";
		String rev ="";
		
		for(int i = 0; i<=name.length()-1; i++)
		{
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.contains(rev))
		{
			System.out.println(name + " : "+rev+" -: The given string name is polindrome");
		} else {
			System.out.println(name + " : "+rev+" -: The given string name is not polindrome");
		}
		
	}
}
