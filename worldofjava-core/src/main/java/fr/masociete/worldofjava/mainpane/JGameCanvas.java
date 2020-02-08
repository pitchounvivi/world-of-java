package fr.masociete.worldofjava.mainpane;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.cartejeu.services.CarteJeuLoadCelluleServices;
import fr.masociete.worldofjava.constante.WorldOfJavaConstante;
import fr.masociete.worldofjava.singleton.CarteJeuManager;

public class JGameCanvas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1101009016491540592L;

	/***
	 * 
	 * @throws IOException
	 */
	public JGameCanvas() throws IOException {
		CarteJeuManager.getInstance().setGameCanvas(this);
	}

	/***
	 * Dessin du composant
	 */
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());

		Cellule[][] carteJeu = CarteJeuManager.getInstance().getCarteJeu();

		int compteur = 0;
		for (int i = 0, ni = carteJeu.length; i < ni; i++) {
			for (int j = 0, nj = carteJeu[i].length; j < nj; j++) {
				try {
					CarteJeuLoadCelluleServices.drawCellule(this, g, carteJeu[i][j], compteur++,
							j * WorldOfJavaConstante.TUILE_WIDTH, i * WorldOfJavaConstante.TUILE_HEIGHT);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}