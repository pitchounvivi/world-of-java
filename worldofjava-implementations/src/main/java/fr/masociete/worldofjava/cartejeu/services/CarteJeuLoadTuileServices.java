package fr.masociete.worldofjava.cartejeu.services;

import fr.masociete.worldofjava.cartejeu.dto.Plaine;
import fr.masociete.worldofjava.cartejeu.dto.PlaineStone;
import fr.masociete.worldofjava.cartejeu.dto.Tuile;

public class CarteJeuLoadTuileServices {

	public static Tuile getTuile(String theTuile) {
		Tuile tuile = null;
		if (theTuile != null) {
			switch (theTuile) {
			case "plaine":
				tuile = new Plaine();
				break;
			case "plaineStone":
				//System.out.println("Plaine stone");
				tuile = new PlaineStone();
				break;
			}
		}

		return tuile;
	}
}
