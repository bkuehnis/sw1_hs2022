package tza.ch.zhaw.buerlxen.uebung12;


public class FlughafenTest {

	public static void main(String[] args) {
		Flughafen h = new Flughafen("Hamburg","HAM");
		Flughafen a = new Flughafen("Amsterdam","AMS");
		Flughafen z = new Flughafen("Zuerich","ZRH");
		Flughafen p = new Flughafen("Paris","CDG");
		Flughafen b = new Flughafen("Berlin","BER");
		Flughafen m = new Flughafen("Muenchen","MUC");
		Flughafen r = new Flughafen("Rom","FCO");
		
		h.addVerbindung(new  Verbindung(a, 152));
		a.addVerbindung(new  Verbindung(h, 301));
		a.addVerbindung(new  Verbindung(p, 203));
		a.addVerbindung(new  Verbindung(z, 85));
		z.addVerbindung(new  Verbindung(r, 234));
		b.addVerbindung(new  Verbindung(a, 166));
		b.addVerbindung(new  Verbindung(m, 186));
		b.addVerbindung(new  Verbindung(r, 251));
		m.addVerbindung(new  Verbindung(b, 220));
		m.addVerbindung(new  Verbindung(p, 186));
		r.addVerbindung(new  Verbindung(p, 310));
		
		h.print();
		a.print();
		z.print();
		p.print();
		b.print();
		m.print();
		r.print();
	}
}
