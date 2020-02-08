package fr.masociete.worldofjava.joueur.mouvement;

import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.constante.WorldOfJavaConstante;
import fr.masociete.worldofjava.joueur.dto.Joueur;
import fr.masociete.worldofjava.services.mouvement.Mouvement;
import fr.masociete.worldofjava.singleton.CarteJeuManager;
import fr.masociete.worldofjava.singleton.JoueurManager;

public class JoueurMouvement {

	/***
	 * 
	 * @param joueur
	 */
	// mouvement � gauche
	public static void gauche() {
		final Joueur joueurCourant = JoueurManager.getInstance().getJoueurCourant();
		final Cellule cellule = CarteJeuManager.getInstance().getCelluleOfJoueur(joueurCourant);
		if (cellule != null) {

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x - 1) >= 0) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y][x - 1];

				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y][x - 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return;
				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
			}
		}
	}

	/***
	 * 
	 * @param joueur
	 */
	// mouvement � droite
	public static void droite() {
		final Joueur joueurCourant = JoueurManager.getInstance().getJoueurCourant();
		final Cellule cellule = CarteJeuManager.getInstance().getCelluleOfJoueur(joueurCourant);
		if (cellule != null) {
			System.out.println("déplacer " + joueurCourant.getNom() + ", " + joueurCourant.getPersonnage()
					+ " sur cellule " + cellule + "(" + cellule.getTempX() + "," + cellule.getTempY() + ")");

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x + 1) < WorldOfJavaConstante.MAP_WIDTH) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y][x + 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y][x + 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return;

				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
			}
		}
	}

	/***
	 * 
	 * @param joueur
	 */
	public static void haut() {
		final Joueur joueurCourant = JoueurManager.getInstance().getJoueurCourant();
		final Cellule cellule = CarteJeuManager.getInstance().getCelluleOfJoueur(joueurCourant);
		if (cellule != null) {
			System.out.println("déplacer " + joueurCourant.getNom() + ", " + joueurCourant.getPersonnage()
					+ " sur cellule " + cellule + "(" + cellule.getTempX() + "," + cellule.getTempY() + ")");

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((y - 1) > 0) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y - 1][x];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y - 1][x] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return;

				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
			}
		}
	}

	/***
	 * 
	 * @param joueur
	 */
	// mouvement bas
	public static void bas() {
		final Joueur joueurCourant = JoueurManager.getInstance().getJoueurCourant();
		final Cellule cellule = CarteJeuManager.getInstance().getCelluleOfJoueur(joueurCourant);
		if (cellule != null) {
			System.out.println("déplacer " + joueurCourant.getNom() + ", " + joueurCourant.getPersonnage()
					+ " sur cellule " + cellule + "(" + cellule.getTempX() + "," + cellule.getTempY() + ")");

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((y + 1) < WorldOfJavaConstante.MAP_HEIGHT) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y + 1][x];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y + 1][x] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return;

				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
			}
		}
	}

	/***
	 * Mouvements diagonaux
	 */

	/***
	 * 
	 * @param joueur
	 */
	// mouvement � gauche-haut
	public static void gaucheHaut() {
		final Joueur joueurCourant = JoueurManager.getInstance().getJoueurCourant();
		final Cellule cellule = CarteJeuManager.getInstance().getCelluleOfJoueur(joueurCourant);
		if (cellule != null) {
			System.out.println("d�placer " + joueurCourant.getNom() + ", " + joueurCourant.getPersonnage()
					+ " sur cellule " + cellule + "(" + cellule.getTempX() + "," + cellule.getTempY() + ")");

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((y - 1) >= 0 && (x - 1) >= 0) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y - 1][x - 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y - 1][x - 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return;

				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
			}
		}
	}

	/***
	 * 
	 * @param joueur
	 */
	// mouvement � droite
	public static void droiteHaut() {
		final Joueur joueurCourant = JoueurManager.getInstance().getJoueurCourant();
		final Cellule cellule = CarteJeuManager.getInstance().getCelluleOfJoueur(joueurCourant);
		if (cellule != null) {
			System.out.println("déplacer " + joueurCourant.getNom() + ", " + joueurCourant.getPersonnage()
					+ " sur cellule " + cellule + "(" + cellule.getTempX() + "," + cellule.getTempY() + ")");

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((y - 1) >= 0 && (x + 1) < WorldOfJavaConstante.MAP_WIDTH) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y - 1][x + 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y - 1][x + 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return;

				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
			}
		}
	}

	/***
	 * 
	 * @param joueur
	 */
	public static void gaucheBas() {
		final Joueur joueurCourant = JoueurManager.getInstance().getJoueurCourant();
		final Cellule cellule = CarteJeuManager.getInstance().getCelluleOfJoueur(joueurCourant);
		if (cellule != null) {
			System.out.println("déplacer " + joueurCourant.getNom() + ", " + joueurCourant.getPersonnage()
					+ " sur cellule " + cellule + "(" + cellule.getTempX() + "," + cellule.getTempY() + ")");

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x - 1) >= 0 && (y + 1) < WorldOfJavaConstante.MAP_HEIGHT) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y + 1][x - 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y + 1][x - 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return;

				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
			}
		}
	}

	/***
	 * 
	 * @param joueur
	 */
	public static void droiteBas() {
		final Joueur joueurCourant = JoueurManager.getInstance().getJoueurCourant();
		final Cellule cellule = CarteJeuManager.getInstance().getCelluleOfJoueur(joueurCourant);
		if (cellule != null) {
			System.out.println("déplacer " + joueurCourant.getNom() + ", " + joueurCourant.getPersonnage()
					+ " sur cellule " + cellule + "(" + cellule.getTempX() + "," + cellule.getTempY() + ")");

			final int x = cellule.getTempX();
			final int y = cellule.getTempY();

			if ((x + 1) < WorldOfJavaConstante.MAP_WIDTH && (y + 1) < WorldOfJavaConstante.MAP_HEIGHT) {

				Cellule celluleDestination = CarteJeuManager.getInstance().getCarteJeu()[y + 1][x + 1];
				if (celluleDestination == null) {
					celluleDestination = new Cellule();
					CarteJeuManager.getInstance().getCarteJeu()[y + 1][x + 1] = celluleDestination;
					Mouvement.mouvementCellule(cellule, celluleDestination);
					return;

				}

				boolean isAllow = CarteJeuManager.isAllowCellule(cellule, celluleDestination);
				if (isAllow) {
					Mouvement.mouvementCellule(cellule, celluleDestination);

				}
			}
		}
	}
}