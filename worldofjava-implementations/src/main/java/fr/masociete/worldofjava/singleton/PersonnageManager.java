package fr.masociete.worldofjava.singleton;

import java.util.HashMap;
import java.util.Map;

import fr.masociete.worldofjava.dto.Personnage;

public class PersonnageManager {

	private static PersonnageManager personnageManager;

	private Map<String, Personnage> mapPersonnages = new HashMap<>();

	public static PersonnageManager getInstance() {
		if (personnageManager == null) {
			personnageManager = new PersonnageManager();
		}
		return personnageManager;
	}

	/***
	 * Constructeur
	 */
	public PersonnageManager() {
	}

	public Map<String, Personnage> getMapPersonnages() {
		return mapPersonnages;
	}

	public void setMapPersonnages(Map<String, Personnage> mapPersonnages) {
		this.mapPersonnages = mapPersonnages;
	}

	public void addPersonnage(Personnage personnage) {
		this.mapPersonnages.put(personnage.getNomPersonnage(), personnage);
	}

	public Personnage getPersonnageByNomPersonnage(String nameOfPersonnage) {
		final Personnage personnage = mapPersonnages.get(nameOfPersonnage);
		return personnage;
	}

}
