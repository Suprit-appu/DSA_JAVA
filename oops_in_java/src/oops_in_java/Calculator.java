package oops_in_java;

 class Clculator1 {
	
	int add(int a, int b){
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Clculator1 Calc = new Clculator1();
		
System.out.println("Sum of 2 ints: "+ Calc.add(5, 10));
System.out.println("Sum of 3 ints: "+ Calc.add(5, 10, 15));
System.out.println("Sum of 2 ints: "+ Calc.add(5.5, 10));
	}
}