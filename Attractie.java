package kermis;

public class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	int aantalKeerDraaien;
	int aantalKaartjes;
	double omzet;
	static final Kassa kassa = new Kassa();

	Attractie(String naam, double prijs, int oppervlakte) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}

	public void draaien() {
		System.out.println("De attractie '" + this.naam + "' draait.");
		this.aantalKeerDraaien++;
//		System.out.println(this.naam + " heeft zo vaak gedraaid: " + this.aantalKeerDraaien);
		kaartVerkoop();
	}

	public void kaartVerkoop() {
		this.aantalKaartjes++;
		this.omzet = omzet + prijs;
//		System.out.println(naam + " heeft zoveel kaartjes verkocht:" + aantalKaartjes);
//		System.out.println(naam + " heeft zoveel omzet:" + omzet);
		kassa.verhoogAantalKaartjes();
		kassa.verhoogTotaleOmzet(prijs);
		kassa.toonOmzetOfKaartverkoop();

	}
}

class Botsauto extends Attractie {
	public Botsauto(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Spin extends RisicoRijkeAttracties {
	public Spin(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Spiegelhuis extends Attractie {
	public Spiegelhuis(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Spookhuis extends Attractie {
	public Spookhuis(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Hawaii extends RisicoRijkeAttracties {
	public Hawaii(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Ladderklimmen extends Attractie {
	public Ladderklimmen(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}