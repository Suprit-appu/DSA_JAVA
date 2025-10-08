package com;

public class Smallest_element_in_array {
	public static void main(String[] args) {
		int[] arr = { 10, 24, 25, 3, 7};
			int min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i]< min) {
					min = arr[i];
				}
			}
			System.out.println("The Smallest element is : " + min);	
	}

}
