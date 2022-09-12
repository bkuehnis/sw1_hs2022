package tza.ch.zhaw.ajrizple.uebung9;


public class Passenger implements Insasse {

	private String name;
	private boolean firstClass;
	
	public Passenger(String name, boolean firstClass){
		this.name=name;
		this.firstClass=firstClass;
		
	}
	
	public String getName() {
		return name; 
	}
	
	public boolean isFirstClass() {
		return firstClass;
	}
	public void print () {
		if (firstClass==true) {

		System.out.println(name+", First Class");
		}
		if (firstClass==false) {
			System.out.println(name+", Economy");

		}

	}
	
	
}
