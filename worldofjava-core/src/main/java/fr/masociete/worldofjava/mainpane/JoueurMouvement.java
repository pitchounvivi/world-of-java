package fr.masociete.worldofjava.mainpane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import fr.masociete.worldofjava.constante.WorldOfJavaConstante;

public class JoueurMouvement extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3175537554806194001L;

	public JoueurMouvement(ActionListener actionListener) {

		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		JPanel panelMove = new JPanel();
		this.add(panelMove);

		panelMove.setLayout(new GridLayout(3, 3));

		JButton moveGaucheHaut = new JButton("left-top");
		moveGaucheHaut.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_HAUT_GAUCHE);
		panelMove.add(moveGaucheHaut, BorderLayout.WEST);
		moveGaucheHaut.addActionListener(actionListener);

		JButton moveHaut = new JButton("top");
		moveHaut.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_HAUT);
		panelMove.add(moveHaut, BorderLayout.NORTH);
		moveHaut.addActionListener(actionListener);

		JButton moveDroiteHaut = new JButton("right-top");
		moveDroiteHaut.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_HAUT_DROITE);
		panelMove.add(moveDroiteHaut, BorderLayout.EAST);
		moveDroiteHaut.addActionListener(actionListener);

		JButton moveGauche = new JButton("left");
		moveGauche.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_GAUCHE);
		panelMove.add(moveGauche);
		moveGauche.addActionListener(actionListener);

		panelMove.add(new JButton());

		JButton moveDroite = new JButton("right");
		moveDroite.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_DROITE);
		panelMove.add(moveDroite, BorderLayout.EAST);
		moveDroite.addActionListener(actionListener);

		JButton moveGaucheBas = new JButton("left-bottom");
		moveGaucheBas.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_BAS_GAUCHE);
		panelMove.add(moveGaucheBas, BorderLayout.NORTH);
		moveGaucheBas.addActionListener(actionListener);

		JButton moveBas = new JButton("bottom");
		moveBas.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_BAS);
		panelMove.add(moveBas, BorderLayout.SOUTH);
		moveBas.addActionListener(actionListener);

		JButton moveDroiteBas = new JButton("right-bottom");
		moveDroiteBas.setActionCommand(WorldOfJavaConstante.JOUEUR_MOVE_BAS_DROITE);
		panelMove.add(moveDroiteBas, BorderLayout.SOUTH);
		moveDroiteBas.addActionListener(actionListener);

		JPanel panelPersonnagescaracteristiques = new JPanel();
		this.add(panelPersonnagescaracteristiques);

		panelPersonnagescaracteristiques.setLayout(new BorderLayout());

		JButton personnagescaracteristiques = new JButton("Personnagescaracteristiques");
		// personnagescaracteristiques.setActionCommand(Personnagescaracteristiques.getPanneau(Personnage
		// personnage));
		panelPersonnagescaracteristiques.add(personnagescaracteristiques, BorderLayout.CENTER);
		personnagescaracteristiques.addActionListener(actionListener);
	}

}
