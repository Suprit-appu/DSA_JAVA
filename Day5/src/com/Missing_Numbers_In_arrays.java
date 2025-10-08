package com;

public class Missing_Numbers_In_arrays {
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 6};
		int n = 6;
		int sum = n * (n+1)/2;
		int arrsum = 0;
		
		for (int num : arr) {
			
			arrsum += num;
		}
		
		System.out.println("MissingNumber:" +(sum - arrsum));
	}
	

}
