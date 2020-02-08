package fr.masociete.worldofjava.accessoire.dto;

import fr.masociete.worldofjava.dto.Objet;

public class Accessoire extends Objet {

	private int encombrement;
//	private boolean accessibilite;
	private int portee;

	public int getEncombrement() {
		return encombrement;
	}

	public void setEncombrement(int encombrement) {
		this.encombrement = encombrement;
	}

//	public boolean isAccessibilite() {
//		return accessibilite;
//	}
//
//	public void setAccessibilite(boolean accessibilite) {
//		this.accessibilite = accessibilite;
//	}

	public int getPortee() {
		return portee;
	}

	public void setPortee(int portee) {
		this.portee = portee;
	}

	public Accessoire() {
		super();
		setEncombrement(encombrement);
		setPortee(portee);
		// isAccessibilite();

	}
	
	

	

	
}