package kermis;

import java.util.Scanner;

public class Kassa{
	private double totaleOmzetKermis;
	private int totaalAantalKaartjes;

	public double getTotaleOmzetKermis() {
		return totaleOmzetKermis;
	}
	
	public int getTotaalAantalKaartjes() {
		return totaalAantalKaartjes;
	}
	
	public void verhoogTotaleOmzet() {
		
	}
	
	public void verhoogAantalKaartjes() {
		this.totaalAantalKaartjes++;
	}
	
//	public void toonOmzetKermis(double omzet) {
//		totaleOmzetKermis = totaleOmzetKermis + omzet;
//		System.out.println("De totale omzet van de kermis is: " + totaleOmzetKermis);
//	}
//
//	public void toonKaartVerkoopKermis(int kaartjes) {
//		totaalAantalKaartjes = totaalAantalKaartjes + kaartjes;
//		System.out.println("Er zijn in totaal zoveel kaartjes verkocht: " + totaalAantalKaartjes);
//	}

	public void toonOmzetOfKaartverkoop() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Voer een 'o' in voor de totale omzet van de kermis, voer een 'k' in voor het totale aantal verkochte kaartjes");
		String invoer = scanner.next();
		if (invoer.equals("o")) {
			System.out.println("De totale omzet van de kermis is: " + this.totaleOmzetKermis);
		} else if (invoer.equals("k")) {
			System.out.println("Het totaal aantal verkochte kaartjes op de kermis is: " + this.totaalAantalKaartjes);
		}
	}
}