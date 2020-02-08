/**
 * 
 */
package fr.masociete.worldofjava.menu.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

/**
 * @author Administrateur
 *
 */
public class SavePropertiesFileAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4048846326160716660L;

	public SavePropertiesFileAction(String titreOfItem) {
		super(titreOfItem);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Pour enregistrer sur un fichier");

		Properties prop = new Properties();
		try (InputStream input = new FileInputStream("../worldofjava-datas/worldofjava.properties")) {

			// load a properties file
			prop.load(input);

			prop.put("test", "valeur de test");// pour fusionner les données de worldofjava et le prop.put dans le
												// dossier sélectionné

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		final JFileChooser dialogue = new JFileChooser(new File("."));

		int retour = dialogue.showSaveDialog(null);
		if (retour == JFileChooser.APPROVE_OPTION) {
			final File fileSelected = dialogue.getSelectedFile();

			try {
				final OutputStream out = new FileOutputStream(fileSelected);
				prop.store(out, "parce qu'il faut bien écrire quelque chose");// pour ajouter le commentaire dans le
																				// dossier sélectionné
				out.close();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

}
