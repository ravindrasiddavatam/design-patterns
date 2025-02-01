package DecoratorDesignPattern;

public class VanillaDecorator extends CoffeeDecorator {

	public VanillaDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Vanilla";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 1.50;
	}
	
	
}
