package fr.masociete.worldofjava.mainpane;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import fr.masociete.worldofjava.constante.WorldOfJavaConstante;
import fr.masociete.worldofjava.singleton.EventSingleton;

public class MainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8931968966488063665L;

	public MainPanel() {
		super(new BorderLayout());

		final ActionListener actionListener = EventSingleton.getInstance();

		JButton bouton1 = new JButton("Bouton 1");
		bouton1.setName("Le bouton 1");
		bouton1.addActionListener(actionListener);

		JButton bouton2 = new JButton("Bouton 2");
		bouton2.setName("Le bouton 2");
		bouton2.addActionListener(actionListener);

		JPanel panelMove = new JPanel();

		panelMove.setLayout(new BorderLayout());

		JButton moveGauche = new JButton("<");
		moveGauche.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_GAUCHE);
		panelMove.add(moveGauche, BorderLayout.WEST);
		moveGauche.addActionListener(actionListener);

		JButton moveDroite = new JButton(">");
		moveDroite.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_DROITE);
		panelMove.add(moveDroite, BorderLayout.EAST);
		moveDroite.addActionListener(actionListener);

		JButton bouton4 = new JButton("Bouton 4");
		bouton4.setName("Le bouton 4");
		bouton4.addActionListener(actionListener);

		JPanel joueurMouvement = new JoueurMouvement(actionListener);

		JGameCanvas centerPanel;
		WestPanel westPanel;

		try {
			centerPanel = new JGameCanvas();
			final JScrollPane scroll = new JScrollPane(centerPanel);
			westPanel = new WestPanel();
			
			this.add(bouton1, BorderLayout.NORTH);
			this.add(joueurMouvement, BorderLayout.EAST);
			this.add(westPanel, BorderLayout.WEST);
			this.add(scroll, BorderLayout.CENTER);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
