package fr.masociete.worldofjava.services.mouvement;

import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.singleton.CarteJeuManager;

public class Mouvement {

	public static void mouvementCellule(Cellule celluleSource, Cellule celluleDestination) {

		celluleDestination.setPersonnage(celluleSource.getPersonnage());

		int x = celluleSource.getTempX();
		int y = celluleSource.getTempY();

		celluleSource.setPersonnage(null);
		celluleSource.setTraversable(true);
		celluleSource.setTempX(-1);
		celluleSource.setTempY(-1);

		Cellule celluleModifee = CarteJeuManager.getInstance().getCarteJeu()[y][x];
		System.out.println("celluleModifee : " + celluleModifee);

		CarteJeuManager.getInstance().getGameCanvas().repaint();

	}
}
