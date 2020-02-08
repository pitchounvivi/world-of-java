/**
 * 
 */
package fr.masociete.worldofjava.menu.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

/**
 * @author Administrateur
 *
 */
public class SaveFileAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6818005798176727437L;

	public SaveFileAction(String titreOfItem) {
		super(titreOfItem);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Il faut créer un fichier");

		// a partir d'ici on va récupérer le chemin d'accès au fichier
		final JFileChooser dialogue = new JFileChooser(new File("."));

		// final File fileSelected = dialogue.getSelectedFile();
		int retour = dialogue.showSaveDialog(null);
		if (retour == JFileChooser.APPROVE_OPTION) {
			final File fileSelected = dialogue.getSelectedFile();
			// System.out.println(fileSelected); //les lignes précedentes permettent de
			// récupérer le chemin d'accès au fichier sélectionné

			//pour écrire un fichier sur le disque
			FileWriter fileWriter;
			try {
				fileWriter = new FileWriter(fileSelected);
				fileWriter.write("Texte a écrire");
				fileWriter.flush();
				fileWriter.close();
			//fin de la zone d'enregistrement
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}

}
