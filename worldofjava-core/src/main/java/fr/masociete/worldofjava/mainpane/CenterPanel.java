package fr.masociete.worldofjava.mainpane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.masociete.worldofjava.cartejeu.dto.Cellule;
import fr.masociete.worldofjava.singleton.CarteJeuManager;

public class CenterPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 372772191286844097L;

	public CenterPanel() {
		super(new BorderLayout());

		// setbackground of panel
		this.setBackground(Color.red);

		final JLabel label = new JLabel("Bienvenue sur World Of Java");
		this.add(label, BorderLayout.NORTH);

		final JPanel carteJeuPanel = new JPanel();
		this.add(carteJeuPanel, BorderLayout.CENTER);

		Cellule[][] carteJeu = CarteJeuManager.getInstance().getCarteJeu();
		for (int i = 0, ni = carteJeu.length; i < ni; i++) {
			final JPanel rowCarteJeuPanel = new JPanel();
			carteJeuPanel.add(rowCarteJeuPanel);
			for (int j = 0, nj = carteJeu[i].length; j < nj; j++) {
				final Cellule cellule = carteJeu[i][j];
				JPanel cellulePanel = new CellulePanel(cellule);

				if (cellule != null && cellule.getPersonnage() != null) {

					JLabel coordonnees = new JLabel("x:" + i + ", y:" + j);
					cellulePanel.add(coordonnees);

					JLabel personnage = new JLabel(cellule.getPersonnage().getNom());
					cellulePanel.add(personnage);
				}

				rowCarteJeuPanel.add(cellulePanel);
			}
		}
	}
}