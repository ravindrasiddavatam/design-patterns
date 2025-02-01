package DecoratorDesignPattern;

public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Sugar";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 0.50;
	}
	
	
}
