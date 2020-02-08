package fr.masociete.worldofjava.mainpane;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.cartejeu.dto.Tuile;

public class CellulePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private Cellule cellule;

	private String pathToImage = "../worldofjava-datas/plaine.png";

	public CellulePanel(Cellule cellule) {
		this.cellule = cellule;
	}

	@Override
	public void paintComponent(Graphics g) {
		String theImage = this.pathToImage;
		if (this.cellule != null) {
			final Tuile tuile = this.cellule.getTuile();
			if (tuile == null) {
				theImage = "../worldofjava-datas/plaine.png";
			} else {
				theImage = tuile.getImage();
			}
		}
		try {
			BufferedImage image = ImageIO.read(new File(theImage));
			Dimension size = getSize();
			g.drawImage(image, 0, 0, size.width, size.height, this);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}