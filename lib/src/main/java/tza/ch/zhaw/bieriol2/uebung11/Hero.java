package tza.ch.zhaw.bieriol2.uebung11;

public class Hero {

	private String publisher;
	private String name;
	private String gender;
	private String alignment;
	private String hair;
	private String eye;
	private double height;
	private double weight;

	public String getPublisher() {
		return publisher;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getAlignment() {
		return alignment;
	}

	public String getHair() {
		return hair;
	}

	public String getEye() {
		return eye;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void print() {
		System.out.print(name);
		System.out.print(": " + publisher + " (");
		System.out.print("Gender: " + gender + ", ");
		System.out.print("Alignment: " + alignment + ", ");
		System.out.print("Hair: " + hair + ", ");
		System.out.print("Eye: " + eye + ", ");
		System.out.print("Height: " + height + ", ");
		System.out.println("Weight: " + weight + ")");
	}
}
