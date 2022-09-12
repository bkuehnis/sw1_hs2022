package tza.ch.zhaw.bieriol2.uebung9;


public class Passenger implements Insasse {
	private String name;
	private boolean firstClass;

	public Passenger(String name, boolean firstClass) {
		this.name = name;
		this.firstClass = firstClass;
	}

	public String getName() {
		return this.name;
	}

	public boolean isFirstClass() {
		return this.firstClass;
	}

	public void print() {
		if (this.firstClass == true) {
			System.out.println(this.name + ", First Class");
		} else {
			System.out.println(this.name + ", Economy");
		}
	}

}
