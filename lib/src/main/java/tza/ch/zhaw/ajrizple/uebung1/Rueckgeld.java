package tza.ch.zhaw.ajrizple.uebung1;

public class Rueckgeld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int preis = 105;
		int bezahlt = 500;
		int rueckgeld = bezahlt - preis;
		
		System.out.println("Preis: " +preis+ " Rappen");
		System.out.println("Bezahlt: " +bezahlt+ " Rappen");
		System.out.println("Rueckgeld: " +rueckgeld+ " Rappen");
		System.out.println("");
		
		int fl = rueckgeld/500;
		int zl = (rueckgeld-fl*500)/200;
		int el = (rueckgeld-fl*500-zl*200)/100;
		int fr = (rueckgeld-fl*500-zl*200-el*100)/50;
		int zr = (rueckgeld-fl*500-zl*200-el*100-fr*50)/20;
		int zer = (rueckgeld-fl*500-zl*200-el*100-fr*50-zr*20)/10;
		int fur = (rueckgeld-fl*500-zl*200-el*100-fr*50-zr*20-zer*10)/5;
		
		System.out.println("5 Fr: " +fl+ " Stück");
		System.out.println("2 Fr: " +zl+ " Stück");
		System.out.println("1 Fr: " +el+ " Stück");
		System.out.println("50 Rp: " +fr+ " Stück");
		System.out.println("20 Rp: " +zr+ " Stück");
		System.out.println("10 Rp: " +zer+ " Stück");
		System.out.println("5 Rp: " +fur+ " Stück");
		
		

	}

}
