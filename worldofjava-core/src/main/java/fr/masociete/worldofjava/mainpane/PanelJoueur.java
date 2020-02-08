package fr.masociete.worldofjava.mainpane;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.joueur.dto.Joueur;
import fr.masociete.worldofjava.singleton.JoueurManager;

public class PanelJoueur extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3823196033036885122L;

	public PanelJoueur() {

		final Joueur joueur = JoueurManager.getInstance().getJoueurCourant();
		final Personnage personnage = JoueurManager.getInstance().getPersonnageCourant();

		String[] entete = { "clé", "valeur" };
		Object[][] datas = { { "joueur", joueur.getNom() }, { "personnage", personnage.getNomPersonnage() } };

		JTable table = new JTable(datas, entete);
		JScrollPane scroll = new JScrollPane(table);
		this.add(scroll);
		// this.setViewportView(table);
	}
}
