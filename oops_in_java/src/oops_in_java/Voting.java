package oops_in_java;

public class Voting {
	public static void main(String[] args) {
		
		int age = 18;
		
		if (age < 18) {
			System.out.println(age + " is not eligible for voting");
		} else if (age >= 18) {
			System.out.println(age + " is eligible for voting");
		}else
		{
			System.out.println(age + " it is invalid");
		}
	}

}
