package StrategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy {
	
	
	private long creditCardNumber;
	private int cvv;
	
	
	public CreditCardPayment(long creditCardNumber, int cvv) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.cvv = cvv;
	}
	
	@Override
	public void paymentMethod(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid via" + " " + creditCardNumber + " " + amount);
	}

}
