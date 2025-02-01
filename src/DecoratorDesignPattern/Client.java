package DecoratorDesignPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());
		
		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());
		
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());
		
		coffee = new VanillaDecorator(coffee);
		System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());
		
	}

}
