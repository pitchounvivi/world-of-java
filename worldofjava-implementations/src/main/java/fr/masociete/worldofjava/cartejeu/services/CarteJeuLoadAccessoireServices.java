package fr.masociete.worldofjava.cartejeu.services;

import fr.masociete.worldofjava.accessoire.dto.Accessoire;
import fr.masociete.worldofjava.accessoire.dto.BaguetteMagique;
import fr.masociete.worldofjava.accessoire.dto.EpeeDeuxMain;
import fr.masociete.worldofjava.accessoire.dto.Glaive;
import fr.masociete.worldofjava.accessoire.dto.Pioche;

public class CarteJeuLoadAccessoireServices {

	public static Accessoire getAccessoire(String theAccessoire) {
		Accessoire accessoire = null;
		if (theAccessoire != null) {
			switch (theAccessoire) {
			case "pioche":
				accessoire = new Pioche();
				break;
			case "glaive":
				accessoire = new Glaive();
				break;
			case "epeeDeuxMain":
				accessoire = new EpeeDeuxMain();
				break;
			case "baguetteMagique":
				accessoire = new BaguetteMagique();
				break;
			}
		}
		return accessoire;

	}
}
