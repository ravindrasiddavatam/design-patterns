package StrategyDesignPattern;

public class PaymentProcessor {
	
	private PaymentStrategy paymentStrategy;


	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void executePayment(double amount) {
		 if (paymentStrategy == null) {
	            throw new IllegalStateException("Payment strategy not set.");
	        }
		paymentStrategy.paymentMethod(amount);
	}



}
