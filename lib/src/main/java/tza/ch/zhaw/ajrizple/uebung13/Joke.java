package tza.ch.zhaw.ajrizple.uebung13;


public class Joke {
	
	private String category;
	private String type;
	private String joke;
	private String setup;
	private String delivery;
	
	private final String SINGLE = "single";
	private final String TWOPART = "twopart";
	
	public void print() {
		if(type.equals(SINGLE)) {
			System.out.println(joke);
			
		} else if(type.equals(TWOPART)) {
			System.out.println("A: " + setup);
			System.out.println("B: " + delivery);
		}
	}

	public String getJoke() {
		if(type.equals(SINGLE)) {
			return joke;
		} else if(type.equals(TWOPART)) {
			return "A: " + setup + "\nB: " + delivery;
		}
		return null;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public void setJoke(String joke) {
		this.joke = joke;
	}

	public void setSetup(String setup) {
		this.setup = setup;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

}
