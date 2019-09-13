package kermis;

public class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	int aantalKeerDraaien;
	int aantalKaartjes;
	double omzet;
	Kassa kassa = new Kassa();
	
	
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
		this.omzet = aantalKaartjes + prijs;
//		System.out.println("deze attractie heeft zoveel kaartjes verkocht: " + this.aantalKaartjes);
//		System.out.println("de omzet van deze attractie is " + this.omzet  );

		kassa.verhoogAantalKaartjes();
		kassa.verhoogTotaleOmzet();
		kassa.toonOmzetOfKaartverkoop();

	}
}



class Botsauto extends Attractie {
	public Botsauto(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Spin extends Attractie {
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

class Hawaii extends Attractie {
	public Hawaii(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}

class Ladderklimmen extends Attractie {
	public Ladderklimmen(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
}