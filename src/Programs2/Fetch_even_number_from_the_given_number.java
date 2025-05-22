package Programs2;

public class Fetch_even_number_from_the_given_number {

	public static void main(String[] args) {
		
		int num = 2475;
		while(num != 0)
		{
			if(num%2 == 0)
			{
				int rem = num%10;
				System.out.println(rem);
			}
			
			num = num/10;
			System.out.println("NUM :- "+num);
		}
		}
	}

