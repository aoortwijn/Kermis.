package kermis;

import java.util.Scanner;

public class Kermis {

	double totaleOmzet;
	int totaalAantalKaartjes;
	
	Attractie botsauto = new Botsauto("Botsauto", 2.50, 0);
	Attractie spin = new Spin("Spin", 2.25, 0);
	Attractie spiegelhuis = new Spiegelhuis("Spiegelhuis", 2.75, 0);
	Attractie spookhuis = new Spookhuis("Spookhuis", 3.20, 0);
	Attractie hawaii = new Hawaii("Hawaii", 2.90, 0);
	Attractie ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00, 0);

	
	
	public static void main(String[] args) {
		Kermis kermis = new Kermis();

		System.out.println("Welkom op de kermis");
		kermis.kermisDraaien();
	}

	public void kermisDraaien() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voer een getal van 1-6 in om een attractie te laten draaien");
		int invoer = scanner.nextInt();
		if (invoer < 1 || invoer > 6) {
			System.out.println("Ongeldige invoer, probeer opnieuw een getal tussen 1-6 in te voeren");
			kermisDraaien();
		} else
			switch (invoer) {
			case 1:
				botsauto.draaien();
				break;
			case 2:
				spin.draaien();
				break;
			case 3:
				spiegelhuis.draaien();
				break;
			case 4:
				spookhuis.draaien();
				break;
			case 5:
				hawaii.draaien();
				break;
			case 6:
				ladderklimmen.draaien();
				break;

			}
		kermisDraaien();
	}

}
