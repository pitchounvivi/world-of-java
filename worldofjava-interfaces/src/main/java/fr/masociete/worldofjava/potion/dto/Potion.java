package fr.masociete.worldofjava.potion.dto;

import fr.masociete.worldofjava.dto.Objet;

public class Potion extends Objet {

	private int pointVie;
	

	public int getPointVie() {
		return pointVie;
	}

	public void setPointVie(int pointVie) {
		this.pointVie = pointVie;
	}

	public Potion() {
		super();
		setPointVie(pointVie);
		
	}

		
	

}
