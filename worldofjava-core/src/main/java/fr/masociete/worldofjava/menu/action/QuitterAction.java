/**
 * 
 */
package fr.masociete.worldofjava.menu.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * @author Administrateur
 *
 */
public class QuitterAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2945351690468826818L;

	public QuitterAction(String titreOfItem) {
		super(titreOfItem);
	}

	// @override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
