package Programs2;

public class factorial {

	public static void main(String[] args) {
		
		int no = 5;
		int fact =1;
		
		for(int i = no; i>=1; i--)
		{
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
