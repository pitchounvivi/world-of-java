package fr.masociete.worldofjava.cartejeu.services;

import fr.masociete.worldofjava.coffre.dto.Coffre;
import fr.masociete.worldofjava.coffre.dto.CoffreAccessoire;
import fr.masociete.worldofjava.coffre.dto.CoffreDePieces;

public class CarteJeuLoadCoffreServices {

	public static Coffre getCoffre(String theCoffre, String theNombrePiece) {

		if (theCoffre != null) {
			if (theCoffre.equals("coffreDePieces")) {
				int nombrePiece = 0;
				if (theNombrePiece != null) {
					nombrePiece = Integer.parseInt(theNombrePiece);
				}
				Coffre coffre = new CoffreDePieces(nombrePiece);
				return coffre;
			}

			if (theCoffre.equals("coffreAccessoire")) {
				Coffre coffre = new CoffreAccessoire();
				return coffre;
			}
		}

		return null;
	}

}
