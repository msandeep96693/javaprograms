package Linkedin_java_programs;

import java.util.Arrays;

public class merge_two_array {

	public static void main(String[] args) {
		

		// using for loop
		
		int arr1 [] = { 1,2,3,4};

		int arr2 [] = {9,8,7,6};
		
		int arr [] = new int[arr1.length+arr2.length];
		
		
		for(int i = 0; i<=arr1.length-1; i++)
		{
			 arr[i] = arr1[i];
			 System.out.println("Array :- "+arr[i]);
		}
		
		
		for(int i = 0; i<= arr2.length-1; i++)
		{
			arr[arr1.length+i] = arr2[i];
			
			System.out.println("aaaaaaaaa :- "+arr[arr1.length+i]);
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
//		int arr1 [] = { 1,2,3,4};
//		
//		int arr2 [] = {9,8,7,6};
//		
//		int arr [] = new int[arr1.length+arr2.length];
//		
//		System.arraycopy(arr1, 0, arr, 0, arr1.length);
//		
//		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
//		
//		
//		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
