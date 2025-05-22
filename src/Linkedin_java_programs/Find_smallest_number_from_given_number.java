package Linkedin_java_programs;

public class Find_smallest_number_from_given_number 
{

	public static void main(String[] args) 
	{
		int arr [] = {9,8,7,6,5};
		int small = arr[0];
		
		for(int i = 1; i< arr.length; i++)
		{
			if(arr[i] < small)
			{
				small = arr[i];
			}
		}
		System.out.println(small);
	}

}
