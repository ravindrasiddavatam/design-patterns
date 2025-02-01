package DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator {
	
	
	
	public MilkDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 1.50;
	}
	
	

}
