package day3;

public class Second_largeast_element {
	public static void main(String[] args) {
		int[] arr = {10,5,8,20};
		int largest = Integer.MIN_VALUE; //-2.14 //10 //20
		int secondLargest=Integer.MIN_VALUE;//-2.14 //10
		
		for(int num : arr) {
			if(num>largest) {
				secondLargest=largest;
				largest=num;
			}else if(num>secondLargest && num !=largest) {
				secondLargest=num;
			}
		}
		
		System.out.println("Second Largest: "+ secondLargest);
	}

}
