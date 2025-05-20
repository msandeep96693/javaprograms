package Programs2;

public class fabonacci_series {

	public static void main(String[] args) {
		
		// fabonaccies series using while loop
		
		int fab1 = 1;
		int fab2 = 1; 
		System.out.println(fab1+" "+fab2);
		int i = 1;
		while(i<=10)
		{
			int fab3 = fab1+fab2;
			fab1 = fab2;
			fab2 = fab3;
			System.out.println(fab3);
			i++;
		}
		
		
		
		
		
		
//		// fabonaccies series using for loop
//		
//		int fab1 = 1;
//		int fab2 = 1;
//		System.out.println(fab1+" "+fab2+" ");
//		for(int i = 1; i<=10; i++)
//		{
//			int fab3 = fab1+fab2;
//			fab1 = fab2;
//			fab2 = fab3;
//			System.out.println(fab3);
//				
//		}
	}

}
