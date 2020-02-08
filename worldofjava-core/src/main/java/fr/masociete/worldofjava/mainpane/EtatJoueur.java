package fr.masociete.worldofjava.mainpane;

import fr.masociete.worldofjava.cartejeu.services.CarteJeuLoad;
import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.singleton.CarteJeuManager;
import fr.masociete.worldofjava.singleton.PersonnageManager;

public class EtatJoueur {

	public static void main(String[] args) {
		CarteJeuManager.getInstance();
		CarteJeuLoad.load();

		Personnage etatJoueur = EtatJoueur.getEtatJoueur();
		System.out.println(etatJoueur);

	}

	public static Personnage getEtatJoueur() {

		PersonnageManager.getInstance();

		Personnage etatPersonnage = PersonnageManager.getInstance().getPersonnageByNomPersonnage("Ulric");

//		JoueurServices.updateJoueur(joueur);

		return etatPersonnage;

	}

}
