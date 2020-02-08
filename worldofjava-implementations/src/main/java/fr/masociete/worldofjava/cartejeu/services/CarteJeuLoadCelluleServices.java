package fr.masociete.worldofjava.cartejeu.services;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.cartejeu.dto.Tuile;
import fr.masociete.worldofjava.coffre.dto.Coffre;
import fr.masociete.worldofjava.coffre.dto.CoffreDePieces;
import fr.masociete.worldofjava.constante.WorldOfJavaConstante;
import fr.masociete.worldofjava.dto.Personnage;
import fr.masociete.worldofjava.image.services.ImageService;

public class CarteJeuLoadCelluleServices {

	/***
	 * Dessin de la cellule
	 * 
	 * @param g
	 * @param cellule
	 * @param compteur
	 * @param x
	 * @param y
	 * @throws IOException
	 */
	public static void drawCellule(JComponent panel, Graphics g, Cellule cellule, int compteur, int x, int y)
			throws IOException {
		BufferedImage imageTuile = null;

		if (cellule != null) {
			final Tuile tuile = cellule.getTuile();
			if (tuile != null) {
				imageTuile = ImageIO.read(new File(WorldOfJavaConstante.PATH_TO_DATAS + tuile.getImage()));
			}

			if (imageTuile == null) {
				imageTuile = ImageIO
						.read(new File(WorldOfJavaConstante.PATH_TO_DATAS + WorldOfJavaConstante.TUILE_DEFAUT));
			}

			final Personnage personnage = cellule.getPersonnage();
			if (personnage != null) {
				//System.out.println("personnage image : " + personnage.getImage());
				final BufferedImage imagePersonnage = ImageIO
						.read(new File(WorldOfJavaConstante.PATH_TO_DATAS + personnage.getImage()));
				imageTuile = ImageService.composeImage(imageTuile, imagePersonnage);
			}

			final Coffre coffre = cellule.getCoffre();
			if (coffre != null) {
				//System.out.println("coffre image : " + coffre.getImage());
				final BufferedImage imageCoffre = ImageIO
						.read(new File(WorldOfJavaConstante.PATH_TO_DATAS + coffre.getImage()));
				imageTuile = ImageService.composeImage(imageTuile, imageCoffre);
				if (coffre instanceof CoffreDePieces) {
					g.drawString(String.valueOf(coffre.getPiecesOr()), x, y);
				}
			}
		}

		if (imageTuile == null) {
			imageTuile = ImageIO.read(new File(WorldOfJavaConstante.PATH_TO_DATAS + WorldOfJavaConstante.TUILE_DEFAUT));
		}

		g.drawImage(imageTuile, x, y, panel);

	}
}
