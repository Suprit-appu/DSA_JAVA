package oops_in_java;

abstract class Payment {
	
 abstract void pay(int amount);
 
 void showPaymentGateway() {
	 System.out.println("Using secure Payment Gateway...");
 }	
}

 class CreditCardPayment extends Payment {
	@Override
	void pay (int amount) {
		System.out.println"("Paid ₹" + amount + " using Credit Card.");
	}
}

class UPIPayment extends Payment {
 @Override	
 void pay(int amount) {
	 System.out.println("Paid ₹" + amount +" using UPI");
 }
}
public class abstraction {
	@Override
 void pay(int amount) {
	 System.out.println("Paid ₹" + amount + " in Cash.");
 }
}


public class abstraction {
 public static void main(String[] args) {
	 Payment p1 = new CreditCardPayment();
	 Payment p2 = new UPIPayment();
	 Payment p3 = new CashPayment();
	 
	 p1.showPaymentGateway();
	 p1.pay(500);
	 
	 p2.showPaymentGateway();
	 p2.pay(1000);
	 
	 p3.showPaymentGateway();
	 p3.pay(1500);
 }
}