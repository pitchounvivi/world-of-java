/**
 * 
 */
package fr.masociete.worldofjava.menu.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

/**
 * @author Administrateur
 *
 */
public class OpenFileAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4717766609156893969L;

	public OpenFileAction(String titreOfItem) {
		super(titreOfItem);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Il faut ouvrir un fichier");

		final JFileChooser dialogue = new JFileChooser(new File("."));
		int retour = dialogue.showOpenDialog(null);

		if (retour == JFileChooser.APPROVE_OPTION) {
			final File fileSelected = dialogue.getSelectedFile();
			Properties prop = new Properties();
			
			try (InputStream input = new FileInputStream(fileSelected)) {

				// load a properties file
				prop.load(input);

				final Iterator<Object> iterator = prop.keySet().iterator();
				while (iterator.hasNext()) {
					final Object key = iterator.next();
					final Object data = prop.get(key);

					System.out.println(key + ":" + data);
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}

}
