package oops_in_java;
class Animal{
	
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	void display() {
		System.out.println("dog is a animal");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Dog D1 = new Dog();
		D1.display();
		D1.eat();
	
}
}