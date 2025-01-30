package ObserverDesignPattern;

public class NewsChannel implements Observer {
	
	private String channelName;
	
	
	public NewsChannel(String channelName) {
		super();
		this.channelName = channelName;
	}

	
	@Override
	public void update(String news) {
		// TODO Auto-generated method stub
		System.out.printf("[%s] Breaking News: %s%n", channelName, news);
	}
	
	
	
}
