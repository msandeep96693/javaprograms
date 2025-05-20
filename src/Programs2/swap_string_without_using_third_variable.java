package Programs2;

public class swap_string_without_using_third_variable {

	public static void main(String[] args) {
		
		String a = "SANDEEP";
		String b = "NAGARAJ";
		
		// before swap 
		
		System.out.println("Before swap - a :- "+a);
		System.out.println("Before swap - b :- "+b);
		System.out.println();
		
		// after swap
		
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("After swap - a :- "+a);
		System.out.println("After swap - b :- "+b);

	}

}
