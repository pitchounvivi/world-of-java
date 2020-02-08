package fr.masociete.worldofjava.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import fr.masociete.worldofjava.constante.WorldOfJavaConstante;
import fr.masociete.worldofjava.joueur.mouvement.JoueurMouvement;

public class EventSingleton implements ActionListener {

	public static EventSingleton eventSingleton;

	public static EventSingleton getInstance() {
		if (eventSingleton == null) {
			eventSingleton = new EventSingleton();
		}
		return eventSingleton;
	}

	// gestionnaire d'évènement définit dans ActionListener
	public void actionPerformed(ActionEvent event) {

		final Object source = event.getSource();
		if (source instanceof JButton) {
			final JButton bouton = (JButton) source;
			final String theActionCommande = bouton.getActionCommand();

			switch (theActionCommande) {
			case WorldOfJavaConstante.JOUEUR_MOVE_DROITE:
				JoueurMouvement.droite();
				break;

			case WorldOfJavaConstante.JOUEUR_MOVE_GAUCHE:
				JoueurMouvement.gauche();
				break;

			case WorldOfJavaConstante.JOUEUR_MOVE_HAUT:
				JoueurMouvement.haut();
				break;

			case WorldOfJavaConstante.JOUEUR_MOVE_BAS:
				JoueurMouvement.bas();
				break;

			case WorldOfJavaConstante.JOUEUR_MOVE_HAUT_DROITE:
				JoueurMouvement.droiteHaut();
				break;

			case WorldOfJavaConstante.JOUEUR_MOVE_HAUT_GAUCHE:
				JoueurMouvement.gaucheHaut();
				break;

			case WorldOfJavaConstante.JOUEUR_MOVE_BAS_GAUCHE:
				JoueurMouvement.gaucheBas();
				break;

			case WorldOfJavaConstante.JOUEUR_MOVE_BAS_DROITE:
				JoueurMouvement.droiteBas();
				break;

			default:
				System.out.println("impossible de déterminer l'origine de l'évenement " + source);
			}
		}
	}
}