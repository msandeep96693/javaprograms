package Programs2;

public class Reverse_a_string_using_stringbuilder {

	public static void main(String[] args) {
		
		String str = "Automation";
		
		StringBuilder strbid = new StringBuilder(str).reverse();
		
		System.out.println(strbid);

		
		/* 
		 * In Java, StringBuilder is a class used to create mutable (modifiable) sequences of 
		   characters. Unlike String objects, which are immutable (once created, their values 
		   cannot be changed), a StringBuilder object can be modified without creating a new 
		   object every time you make a change.
		 * 
		 * 
		 */
	}

}
