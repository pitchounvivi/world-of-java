package fr.masociete.worldofjava.cartejeu.services;

import fr.masociete.worldofjava.potion.dto.Potion;
import fr.masociete.worldofjava.potion.dto.PotionSoin;

public class CarteJeuLoadPotionServices {

	public static Potion getPotion(String thePotion) {

		Potion potion = null;
		if (thePotion != null) {
			switch (thePotion) {
			case "potion_soin":
				potion = new PotionSoin();
				break;
			}
		}
		return potion;
	}

}
