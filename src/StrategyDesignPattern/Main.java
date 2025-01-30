package StrategyDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor processor = new PaymentProcessor();
		
		processor.setPaymentStrategy(new CreditCardPayment(123456789,123));
		processor.executePayment(100);
	}

}
