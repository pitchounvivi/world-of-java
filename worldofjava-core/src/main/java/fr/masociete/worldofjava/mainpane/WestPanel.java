package fr.masociete.worldofjava.mainpane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.masociete.worldofjava.constante.WorldOfJavaConstante;

public class WestPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4211654940269031127L;

	public WestPanel() {
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.red));
		this.setSize(200, WorldOfJavaConstante.TUILE_HEIGHT);
		final JLabel label = new JLabel("Etat du Joueur");
		this.add(label, BorderLayout.NORTH);
		this.setVisible(true);

		PanelJoueur panelJoueur = new PanelJoueur();
		panelJoueur.setBorder(BorderFactory.createLineBorder(Color.blue));

		this.add(panelJoueur, BorderLayout.CENTER);

//		final JPanel etatJoueur = new JPanel();
//		this.add(etatJoueur, BorderLayout.CENTER);

	}

}
