package fr.masociete.worldofjava.singleton;

import javax.swing.JComponent;

import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.constante.WorldOfJavaConstante;
import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.joueur.dto.Joueur;

public class CarteJeuManager {

	private static CarteJeuManager carteJeuManager;

	private Cellule[][] carteJeu = new Cellule[WorldOfJavaConstante.MAP_HEIGHT][WorldOfJavaConstante.MAP_WIDTH];

	private JComponent gameCanvas;

	public static CarteJeuManager getInstance() {
		if (carteJeuManager == null) {
			carteJeuManager = new CarteJeuManager();
		}
		return carteJeuManager;
	}

	/***
	 * Constructeur
	 */
	public CarteJeuManager() {
	}

	public Cellule[][] getCarteJeu() {
		return carteJeu;
	}

	public void setCarteJeu(Cellule[][] carteJeu) {
		this.carteJeu = carteJeu;
	}

	public JComponent getGameCanvas() {
		return gameCanvas;
	}

	public void setGameCanvas(JComponent gameCanvas) {
		this.gameCanvas = gameCanvas;
	}

	public Cellule getCelluleOfJoueur(Joueur joueur) {

		final Personnage personnageCourant = JoueurManager.getInstance().getPersonnageCourant();
		// System.out.println("personnageCourant : " + personnageCourant);

		for (int i = 0; i < WorldOfJavaConstante.MAP_HEIGHT; i++) {
			for (int j = 0; j < WorldOfJavaConstante.MAP_WIDTH; j++) {
				final Cellule cellule = CarteJeuManager.getInstance().getCarteJeu()[i][j];
				if (cellule == null) {
					continue;
				}

				final Personnage personnage = cellule.getPersonnage();
				if (personnage == null) {
					continue;
				}

				if (personnage.getNom().equals(personnageCourant.getNom())) {
					cellule.setTempX(j);
					cellule.setTempY(i);
					return cellule;
				}

			}
		}

		return null;
	}

	public Cellule getCelluleOfPersonnage(Personnage personnageARechercher) {

		for (int i = 0; i < WorldOfJavaConstante.MAP_HEIGHT; i++) {
			for (int j = 0; j < WorldOfJavaConstante.MAP_WIDTH; j++) {
				final Cellule cellule = CarteJeuManager.getInstance().getCarteJeu()[i][j];
				if (cellule == null) {
					continue;
				}

				final Personnage personnage = cellule.getPersonnage();
				if (personnage == null) {
					continue;
				}

				if (personnage.getNomPersonnage().equals(personnageARechercher.getNomPersonnage())) {
					cellule.setTempX(j);
					cellule.setTempY(i);
					return cellule;
				}

			}
		}

		return null;
	}

	public static boolean isAllowCellule(Cellule celluleSource, Cellule celluleDestination) {

		System.out.println("cellule destination : " + celluleDestination.isTraversable());

		if (!celluleDestination.isTraversable()) {
			System.out.println("cellule non traversable");
			return false;
		}

		if (celluleDestination.getPersonnage() != null) {
			System.out.println("cellule avec personnage");
			return false;
		}

		System.out.println("cellule ok");

		return true;
	}
}
