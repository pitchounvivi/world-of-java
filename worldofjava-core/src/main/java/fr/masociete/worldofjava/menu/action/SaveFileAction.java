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
		System.out.println("Il faut cr�er un fichier");

		// a partir d'ici on va r�cup�rer le chemin d'acc�s au fichier
		final JFileChooser dialogue = new JFileChooser(new File("."));

		// final File fileSelected = dialogue.getSelectedFile();
		int retour = dialogue.showSaveDialog(null);
		if (retour == JFileChooser.APPROVE_OPTION) {
			final File fileSelected = dialogue.getSelectedFile();
			// System.out.println(fileSelected); //les lignes pr�cedentes permettent de
			// r�cup�rer le chemin d'acc�s au fichier s�lectionn�

			//pour �crire un fichier sur le disque
			FileWriter fileWriter;
			try {
				fileWriter = new FileWriter(fileSelected);
				fileWriter.write("Texte a �crire");
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
