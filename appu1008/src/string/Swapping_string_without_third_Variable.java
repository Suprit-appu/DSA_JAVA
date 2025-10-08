package string;

public class Swapping_string_without_third_Variable {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		a = a + b;
		b = a.substring(0,a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}
