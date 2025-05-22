package Linkedin_java_programs;

public class Find_largest_number_from_given_array {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,10,5};
		
		int max = 0;
		
		for(int i = 0; i<=arr.length-1; i++)
		{
			if(arr[i] > max)
			{
				System.out.println("Array data :- "+arr[i]);
				max = arr[i];
				
			}
		}

		System.out.println(max);
	}

}
