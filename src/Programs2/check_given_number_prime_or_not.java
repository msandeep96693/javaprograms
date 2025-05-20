package Programs2;

public class check_given_number_prime_or_not {
	
	public static void main(String[] args)
	
	{
		
		// check_given_number_prime_or_not ( Range of input )
		for(int i = 1; i<=100; i++)
		{
			int n=i;
			int count = 0;
			for(int j=1; j<=n; j++)
			{
				if(n%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(n+",");
			}
		}
		
		
//		//  check_given_number_prime_or_not
//		
//		int no = 7;
//		int count = 0;
//		
//		for(int i = 1; i<=no; i++)
//		{
//			if(no%i==0)
//			{
//				count++;
//			}
//			
//		}
//		System.out.println(count);
//		if(count==2)
//		{
//			System.out.println("The given number is prime number");
//		} else {
//			System.out.println("The given number is not a prime number");
//		}
	}

}
