package Programs2;

public class Polindrome_using_Stringbuilder {

	public static void main(String[] args) {
		
		String str = "Automation";
		
		StringBuilder reversed = new StringBuilder(str).reverse();
		
		System.out.println(reversed);
		
		if(str.equals(reversed))
		{
			System.out.println("Automation");
		} else 
		{
			System.out.println("Automation not matched ");
		}
		System.out.println(str.equals(reversed));
		
	}

}
