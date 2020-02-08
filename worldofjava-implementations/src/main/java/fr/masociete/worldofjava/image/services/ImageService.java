package fr.masociete.worldofjava.image.services;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class ImageService {

	/***
	 * Association de deux images
	 * 
	 * @param image1
	 * @param image2
	 * @return
	 */
	public static BufferedImage composeImage(BufferedImage image1, BufferedImage image2) {
		Graphics2D g2d = image1.createGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);

		g2d.drawImage(image2, 0, 0, null);

		g2d.dispose();

		return image1;
	}
}
