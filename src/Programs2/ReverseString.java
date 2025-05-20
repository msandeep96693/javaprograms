package Programs2;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String name = "Tech active";
		String rev ="";
		
		for(int i = name.length()-1; i>=0; i--)
		{
			rev = rev+name.charAt(i);
			
		}
		
		System.out.println("REV :- "+ rev);
		
		
		if(name.equals(rev))
		{
			System.out.println("This is polindrome");
		} 
		else
		{
			System.out.println("This is not polindrome");
		}
	}
}
