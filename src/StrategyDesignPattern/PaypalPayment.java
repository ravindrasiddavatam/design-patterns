package StrategyDesignPattern;

public class PaypalPayment implements PaymentStrategy{
	
	private String email;
	
	
	public PaypalPayment(String email) {
		super();
		this.email = email;
	}

	
	@Override
	public void paymentMethod(double amount) {
		// TODO Auto-generated method stub
	System.out.println("Paid via paypal" +" " + email + " "+ amount );	
	}

}
