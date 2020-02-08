package fr.masociete.worldofjava.frame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import fr.masociete.worldofjava.mainpane.MainPanel;

public class WorldOfJavaFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5230443297310151462L;

	public WorldOfJavaFrame() {
		super("World Of Java");

		WindowListener l = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		addWindowListener(l);

		MainPanel mainPanel = new MainPanel();

		this.setContentPane(mainPanel);
		this.setSize(1500, 900);
		this.setVisible(true);

	}
}
