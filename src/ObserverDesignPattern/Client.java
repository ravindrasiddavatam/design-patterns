package ObserverDesignPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewsAgency agency = new NewsAgency();
		
		
		Observer cnn = new NewsChannel("CNN");
		Observer bbc = new NewsChannel("BBC");
		
		agency.registerObserver(cnn);
		agency.registerObserver(bbc);
		
		agency.setNews("New AI Breakthrough!");
		
		
		

	}

}
