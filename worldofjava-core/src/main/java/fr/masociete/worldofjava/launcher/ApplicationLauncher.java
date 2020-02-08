package fr.masociete.worldofjava.launcher;

import java.util.Iterator;
import java.util.Map;

import fr.masociete.worldofjava.cartejeu.services.CarteJeuLoad;
import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.frame.WorldOfJavaFrame;
import fr.masociete.worldofjava.joueur.dto.Joueur;
import fr.masociete.worldofjava.personnage.mouvement.PersonnageMouvementAuto;
import fr.masociete.worldofjava.singleton.CarteJeuManager;
import fr.masociete.worldofjava.singleton.JoueurManager;
import fr.masociete.worldofjava.singleton.PersonnageManager;

public class ApplicationLauncher {

	public static void main(String[] args) {

		JoueurManager.getInstance();
		CarteJeuManager.getInstance();
		CarteJeuLoad.load();

		final Joueur joueur = JoueurManager.getInstance().getMapJoueurs().get("Titi");
		final String nameOfPersonnage = joueur.getPersonnage();
		final Personnage personnageCourant = PersonnageManager.getInstance()
				.getPersonnageByNomPersonnage(nameOfPersonnage);

		JoueurManager.getInstance().setJoueurCourant(joueur, personnageCourant);

		//System.out.println(JoueurManager.getInstance().getMapJoueurs());
		//System.out.println(CarteJeuManager.getInstance().getCarteJeu());

		// Fonction de mouvement automatique des personnages non joueur
		final Map<String, Personnage> mapPersonnages = PersonnageManager.getInstance().getMapPersonnages();

		Iterator<String> iterator = mapPersonnages.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();

			final Personnage personnageMouvementAuto = mapPersonnages.get(key);
			if (personnageMouvementAuto.getNom().equals(personnageCourant.getNom())) {
				continue;
			}

			Thread thread = new Thread(new PersonnageMouvementAuto(personnageMouvementAuto));
			thread.start();

		}
		new WorldOfJavaFrame();
	}
}
