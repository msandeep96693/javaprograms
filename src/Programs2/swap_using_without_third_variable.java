package Programs2;

public class swap_using_without_third_variable {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
//		a = a+b;  // 30
//		b = a-b;  // 10
//		a = a-b;  // 20
		
		a = a*b;
		b = a/b;
		a = a/b;

		System.out.println("a :- "+a+ " b:- "+b);
	}

}
