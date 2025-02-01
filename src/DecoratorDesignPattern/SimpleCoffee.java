package DecoratorDesignPattern;

//Concrete Component
public class SimpleCoffee implements Coffee {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "SimpleCoffee";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 5.00;
	}

}
