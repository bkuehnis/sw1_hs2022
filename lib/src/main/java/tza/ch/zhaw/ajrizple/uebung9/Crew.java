package tza.ch.zhaw.ajrizple.uebung9;


public class Crew implements Insasse {

	private String name;
	private String postition;
	
	
	public Crew(String name, String postition) {
			this.name=name;
			this.postition=postition;
			
		
	}
	
	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(name+", "+postition);
	}
}
