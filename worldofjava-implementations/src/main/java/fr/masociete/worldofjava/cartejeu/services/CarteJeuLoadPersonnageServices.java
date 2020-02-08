package fr.masociete.worldofjava.cartejeu.services;

import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.personnage.dto.Cavaliere;
import fr.masociete.worldofjava.personnage.dto.Chevalier;
import fr.masociete.worldofjava.personnage.dto.Fee;
import fr.masociete.worldofjava.personnage.dto.Gobelin;
import fr.masociete.worldofjava.personnage.dto.Guerriere;
import fr.masociete.worldofjava.personnage.dto.Magicien;
import fr.masociete.worldofjava.personnage.dto.Ork;
import fr.masociete.worldofjava.personnage.dto.Ouvrier;
import fr.masociete.worldofjava.singleton.PersonnageManager;

/***
 * 
 * @author eric
 *
 */
public class CarteJeuLoadPersonnageServices {

	/***
	 * 
	 * @param thePersonnage
	 * @param theNomPersonnage
	 * @return
	 */
	public static Personnage getPersonnage(String thePersonnage, String theNomPersonnage) {

		Personnage personnage = null;
		if (thePersonnage != null) {
			switch (thePersonnage) {
			case "ouvrier":
				personnage = new Ouvrier();
				break;
			case "chevalier":
				personnage = new Chevalier();
				break;
			case "fee":
				personnage = new Fee();
				break;
			case "gobelin":
				personnage = new Gobelin();
				break;
			case "ork":
				personnage = new Ork();
				break;
			case "guerriere":
				personnage = new Guerriere();
				break;
			case "magicien":
				personnage = new Magicien();
				break;
			case "cavaliere":
				personnage = new Cavaliere();
				break;
			}
		}

		if (personnage != null) {
			personnage.setNomPersonnage(theNomPersonnage);
			PersonnageManager.getInstance().addPersonnage(personnage);
		}

		return personnage;
	}

}
