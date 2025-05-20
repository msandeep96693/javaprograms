package Programs2;

public class swap_string_using_with_third_varaible {

	public static void main(String[] args) {
	
     //	swap_string_using_with_third_varaible
		
		String a = "India";
		String b = "Banglore";
		String temp;
		
		System.out.println(" Before swap - a :- "+ a);
		System.out.println(" Before swap - b :- "+ b);
		System.out.println();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(" After swap - a :- "+ a);
		System.out.println(" After swap - b :- "+ b);
	}
}
