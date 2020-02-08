package fr.masociete.worldofjava.cartejeu.services;

import org.json.JSONException;
import org.json.JSONObject;

import fr.masociete.worldofjava.accessoire.dto.Accessoire;
import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.cartejeu.dto.Tuile;
import fr.masociete.worldofjava.coffre.dto.Coffre;
import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.potion.dto.Potion;

public class CarteJeuLoadServices {

	public static JSONObject getJSon(String data) {

		System.out.println(data);

		final JSONObject json = new JSONObject(data);
		// System.out.println(json);
		return json;
	}

	public static Cellule getCellule(JSONObject json) {

		String theAccessoire = null;
		try {
			theAccessoire = json.getString("accessoire");
		} catch (JSONException e) {
			// Ne pas implémenter l'erreur
		}
		String theNomPersonnage = null;
		try {
			theNomPersonnage = json.getString("nomPersonnage");
		} catch (JSONException e) {
			// Ne pas implémenter l'erreur
		}
		String thePotion = null;
		try {
			thePotion = json.getString("potion");
		} catch (JSONException e) {
			// Ne pas implémenter l'erreur
		}
		String thePersonnage = null;
		try {
			thePersonnage = json.getString("personnage");
		} catch (JSONException e) {
			// Ne pas implémenter l'erreur
		}
		String theTuile = "plaine";
		try {
			theTuile = json.getString("tuile");
		} catch (JSONException e) {
			// Ne pas implémenter l'erreur
		}
		boolean isTraversable = true;
		try {
			isTraversable = json.getBoolean("traversable");
		} catch (JSONException e) {
			// Ne pas implémenter l'erreur
		}
		String theCoffre = null;
		String theNombrePiece = null;
		try {
			theCoffre = json.getString("coffre");
			if (theCoffre.equals("coffreDePieces")) {
				theNombrePiece = json.getString("nombredepiece");
			}
		} catch (JSONException e) {
			// Ne pas implémenter l'erreur
		}

		Personnage personnage = CarteJeuLoadPersonnageServices.getPersonnage(thePersonnage, theNomPersonnage);

		Accessoire accessoire = CarteJeuLoadAccessoireServices.getAccessoire(theAccessoire);

		Potion potion = CarteJeuLoadPotionServices.getPotion(thePotion);

		Tuile tuile = CarteJeuLoadTuileServices.getTuile(theTuile);

		Coffre coffre = CarteJeuLoadCoffreServices.getCoffre(theCoffre, theNombrePiece);
		// tuile.setImage("../worldofjava-datas/plaine.png");

		Cellule cellule = new Cellule();
		cellule.setPersonnage(personnage);
		cellule.setAccessoire(accessoire);
		cellule.setPotion(potion);
		cellule.setTuile(tuile);
		cellule.setTraversable(isTraversable);
		cellule.setCoffre(coffre);

		return cellule;
	}

}
