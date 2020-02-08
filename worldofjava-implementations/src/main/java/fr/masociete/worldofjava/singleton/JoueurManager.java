package fr.masociete.worldofjava.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.joueur.dto.Joueur;

public class JoueurManager {

	private static JoueurManager joueurManager;

	private Map<String, Joueur> mapJoueurs = new HashMap<>();

	private Joueur joueurCourant;
	private Personnage personnageCourant;

	public static JoueurManager getInstance() {
		if (joueurManager == null) {
			joueurManager = new JoueurManager();
		}
		return joueurManager;
	}

	/***
	 * Constructeur
	 */
	public JoueurManager() {
		//final List<Joueur> listJoueurs = JoueurServices.getListJoueurs("SELECT * FROM JOUEUR");
		final List<Joueur> listJoueurs = new ArrayList<>(); //JoueurServices.getListJoueurs("SELECT * FROM JOUEUR");
		Joueur joueurtemp = new Joueur();
		joueurtemp.setNom("Titi");
		joueurtemp.setPseudo("Titi");
		joueurtemp.setPersonnage("Ulric");
		listJoueurs.add(joueurtemp);
		for (Joueur joueur : listJoueurs) {
			mapJoueurs.put(joueur.getPseudo(), joueur);
		}
	}

	public Map<String, Joueur> getMapJoueurs() {
		return mapJoueurs;
	}

	public void setMapJoueurs(Map<String, Joueur> mapJoueurs) {
		this.mapJoueurs = mapJoueurs;
	}

	public Joueur getJoueurCourant() {
		return joueurCourant;
	}

	public Personnage getPersonnageCourant() {
		return personnageCourant;
	}

	public void setJoueurCourant(Joueur joueurCourant, Personnage personnageCourant) {
		this.joueurCourant = joueurCourant;
		this.personnageCourant = personnageCourant;
	}

}
